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
        String output = fizzBangService.fizzBangTheNumber(3);
        assertEquals(FIZZ, output);
    }

    @Test
    public void test_5_bang() {
        String output = fizzBangService.fizzBangTheNumber(5);
        assertEquals(BANG, output);
    }

    @Test
    public void test_1_returns_null() {
        String output = fizzBangService.fizzBangTheNumber(1);
        assertEquals(null, output);
    }

    @Test
    public void test_6_returns_fizz() {
        String output = fizzBangService.fizzBangTheNumber(6);
        assertEquals(FIZZ, output);
    }

    @Test
    public void test_10_returns_bang() {
        String output = fizzBangService.fizzBangTheNumber(10);
        assertEquals(BANG, output);
    }
}
