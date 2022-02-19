package com.personal.fizzbuzz.api;

import com.personal.fizzbuzz.api.schema.FizzBuzzResponse;
import com.personal.fizzbuzz.api.schema.NumberRequest;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    static final String FIZZ = "fizz";
    static final String BUZZ = "buzz";

    public FizzBuzzResponse fizzBuzzTheRequest(NumberRequest request) {
        return FizzBuzzResponse.builder()
                .output(fizzBuzzCalculation(request.getInput()))
                .build();
    }

    private String fizzBuzzCalculation(Integer input) {
        var output = "";
        if (input % 3 == 0) {
            output += FIZZ;
        }
        if (input % 5 == 0) {
            output += BUZZ;
        }
        return !output.equals("") ? output : null;
    }
}
