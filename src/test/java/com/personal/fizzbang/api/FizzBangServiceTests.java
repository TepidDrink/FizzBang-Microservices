package com.personal.fizzbang.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static com.personal.fizzbang.api.FizzBangService.BANG;
import static com.personal.fizzbang.api.FizzBangService.FIZZ;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FizzBangServiceTests {

    @InjectMocks
    private FizzBangService fizzBangService;

    @Test
    public void test_3_fizz() {
        FizzBangResponse response = fizzBangService.fizzBangTheNumber(3);
        assertEquals(FIZZ, response.getOutput());
    }

    @Test
    public void test_5_bang() {
        FizzBangResponse response = fizzBangService.fizzBangTheNumber(5);
        assertEquals(BANG, response.getOutput());
    }

    @Test
    public void test_1_returns_null() {
        FizzBangResponse response = fizzBangService.fizzBangTheNumber(1);
        assertEquals(null, response.getOutput());
    }

    @Test
    public void test_6_returns_fizz() {
        FizzBangResponse response = fizzBangService.fizzBangTheNumber(6);
        assertEquals(FIZZ, response.getOutput());
    }

    @Test
    public void test_10_returns_bang() {
        FizzBangResponse response = fizzBangService.fizzBangTheNumber(10);
        assertEquals(BANG, response.getOutput());
    }

    @Test
    public void test_15_returns_fizzbang() {
        FizzBangResponse response = fizzBangService.fizzBangTheNumber(15);
        assertEquals(FIZZ + BANG, response.getOutput());
    }
}
