package com.personal.fizzbuzz.api.schema;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonSerialize
public class FizzBuzzResponse {
    private String output;
}
