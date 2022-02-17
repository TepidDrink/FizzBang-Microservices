package com.personal.fizzbuzz.api;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.personal.fizzbuzz.api.schema.FizzBuzzResponse;
import com.personal.fizzbuzz.api.schema.NumberRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@AllArgsConstructor
public class FizzBuzzController {

    private FizzBuzzService fizzBuzzService;

    @PostMapping("/fizzbuzz")
    public FizzBuzzResponse processRequest(@RequestBody NumberRequest numberRequest) {
        return fizzBuzzService.fizzBuzzTheRequest(numberRequest);
    }

    @RequestMapping(path = "*", method = {GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE})
    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    public BadRequestException processRequestWrongEndpoint(@RequestBody NumberRequest numberRequest) {
        return handleAllExceptions(null);
    }

    @ExceptionHandler
    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    public BadRequestException handleAllExceptions(Exception exception) {
        return new BadRequestException(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase());
    }

    @Getter
    @RequiredArgsConstructor
    @JsonSerialize
    static class BadRequestException {
        private final int status;
        private final String message;
    }
}
