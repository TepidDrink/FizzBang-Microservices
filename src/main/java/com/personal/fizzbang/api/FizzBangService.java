package com.personal.fizzbang.api;

public class FizzBangService {
    static final String FIZZ = "fizz";
    static final String BANG = "bang";

    public String fizzBangTheNumber(int input) {
        if (input % 15 == 0) {
            return FIZZ + BANG;
        } else if (input % 3 == 0) {
            return FIZZ;
        } else if (input % 5 == 0) {
            return BANG;
        } else {
            return null;
        }
    }
}
