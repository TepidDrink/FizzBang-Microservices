package com.personal.fizzbang.api;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonSerialize
public class FizzBangResponse {
    private String output;
}
