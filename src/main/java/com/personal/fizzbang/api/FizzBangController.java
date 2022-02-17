package com.personal.fizzbang.api;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.personal.fizzbang.api.schema.FizzBangResponse;
import com.personal.fizzbang.api.schema.NumberRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class FizzBangController {

    private FizzBangService fizzBangService;

    @PostMapping("/fizzbang")
    @ResponseBody
    public FizzBangResponse processRequest(@RequestBody NumberRequest numberRequest) {
        return fizzBangService.fizzBangTheRequest(numberRequest);
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
