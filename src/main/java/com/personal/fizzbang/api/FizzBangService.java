package com.personal.fizzbang.api;

public class FizzBangService {
    static final String FIZZ = "fizz";
    static final String BANG = "bang";

    public String fizzBangTheNumber(int input) {
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
