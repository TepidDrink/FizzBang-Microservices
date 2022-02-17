package com.personal.fizzbuzz.api;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.personal.fizzbuzz.api.schema.FizzBuzzResponse;
import com.personal.fizzbuzz.api.schema.NumberRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class FizzBuzzController {

    private FizzBuzzService fizzBuzzService;

    @PostMapping("/fizzbuzz")
    @ResponseBody
    public FizzBuzzResponse processRequest(@RequestBody NumberRequest numberRequest) {
        return fizzBuzzService.fizzBuzzTheRequest(numberRequest);
    }

    @ExceptionHandler
    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    public BadRequestException handleAllExceptions(Exception exception) {
        return new BadRequestException(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase());
    }

    @Getter
    @Setter
    @RequiredArgsConstructor
    @JsonSerialize
    class BadRequestException {
        private final int status;
        private final String message;
    }
}
