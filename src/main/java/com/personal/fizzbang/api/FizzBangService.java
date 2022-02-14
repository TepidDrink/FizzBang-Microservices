package com.personal.fizzbang.api;

public class FizzBangService {
    static final String FIZZ = "fizz";
    static final String BANG = "bang";

    public String fizzBangTheNumber(int input) {
        if (input == 3) {
            return FIZZ;
        } else {
            return BANG;
        }
    }
}
