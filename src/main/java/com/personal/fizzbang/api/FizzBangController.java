package com.personal.fizzbang.api;

import org.springframework.web.bind.annotation.RequestBody;

public class FizzBangController {

    public Object processRequest(@RequestBody NumberRequest numberRequest) {
        return "fizz";
    }
}
