package com.personal.fizzbang.api;

public class FizzBangService {
    static final String FIZZ = "fizz";

    public String fizzBangTheNumber(int input) {
        if (input == 3) {
            return FIZZ;
        } else {
            return "bang";
        }
    }
}
