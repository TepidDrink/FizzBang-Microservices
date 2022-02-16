package com.personal.fizzbang.api;

import org.springframework.stereotype.Service;

@Service
public class FizzBangService {
    static final String FIZZ = "fizz";
    static final String BANG = "bang";

    public FizzBangResponse fizzBangTheNumber(Integer input) {
        FizzBangResponse fizzBangResponse = new FizzBangResponse();
        fizzBangResponse.setOutput(fizzBangCalculation(input));
        return fizzBangResponse;
    }

    private String fizzBangCalculation(Integer input) {
        String output = "";
        if (input % 3 == 0) {
            output += FIZZ;
        }
        if (input % 5 == 0) {
            output += BANG;
        }
        return !output.equals("") ? output : null;
    }
}
