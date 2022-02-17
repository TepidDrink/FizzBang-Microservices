package com.personal.fizzbang.api;

import com.personal.fizzbang.api.schema.FizzBangResponse;
import com.personal.fizzbang.api.schema.NumberRequest;
import org.junit.Before;
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

    private NumberRequest request;

    @Before
    public void setup() {
        request = new NumberRequest();
    }

    @Test
    public void test_3_fizz() {
        request.setInput(3);
        FizzBangResponse response = fizzBangService.fizzBangTheRequest(request);
        assertEquals(FIZZ, response.getOutput());
    }

    @Test
    public void test_5_bang() {
        request.setInput(5);
        FizzBangResponse response = fizzBangService.fizzBangTheRequest(request);
        assertEquals(BANG, response.getOutput());
    }

    @Test
    public void test_1_returns_null() {
        request.setInput(1);
        FizzBangResponse response = fizzBangService.fizzBangTheRequest(request);
        assertEquals(null, response.getOutput());
    }

    @Test
    public void test_6_returns_fizz() {
        request.setInput(6);
        FizzBangResponse response = fizzBangService.fizzBangTheRequest(request);
        assertEquals(FIZZ, response.getOutput());
    }

    @Test
    public void test_10_returns_bang() {
        request.setInput(10);
        FizzBangResponse response = fizzBangService.fizzBangTheRequest(request);
        assertEquals(BANG, response.getOutput());
    }

    @Test
    public void test_15_returns_fizzbang() {
        request.setInput(15);
        FizzBangResponse response = fizzBangService.fizzBangTheRequest(request);
        assertEquals(FIZZ + BANG, response.getOutput());
    }

    @Test
    public void test_0_returns_fizzbang() {
        request.setInput(0);
        FizzBangResponse response = fizzBangService.fizzBangTheRequest(request);
        assertEquals(FIZZ + BANG, response.getOutput());
    }

    @Test
    public void test_30_returns_fizzbang() {
        request.setInput(30);
        FizzBangResponse response = fizzBangService.fizzBangTheRequest(request);
        assertEquals(FIZZ + BANG, response.getOutput());
    }
}
