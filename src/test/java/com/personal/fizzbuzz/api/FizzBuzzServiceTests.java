package com.personal.fizzbuzz.api;

import com.personal.fizzbuzz.api.schema.FizzBuzzResponse;
import com.personal.fizzbuzz.api.schema.NumberRequest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static com.personal.fizzbuzz.api.FizzBuzzService.BUZZ;
import static com.personal.fizzbuzz.api.FizzBuzzService.FIZZ;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzServiceTests {

    @InjectMocks
    private FizzBuzzService fizzBangService;

    private NumberRequest request;

    @Before
    public void setup() {
        request = new NumberRequest();
    }

    @Test
    public void test_3_fizz() {
        request.setInput(3);
        FizzBuzzResponse response = fizzBangService.fizzBuzzTheRequest(request);
        assertEquals(FIZZ, response.getOutput());
    }

    @Test
    public void test_5_bang() {
        request.setInput(5);
        FizzBuzzResponse response = fizzBangService.fizzBuzzTheRequest(request);
        assertEquals(BUZZ, response.getOutput());
    }

    @Test
    public void test_1_returns_null() {
        request.setInput(1);
        FizzBuzzResponse response = fizzBangService.fizzBuzzTheRequest(request);
        assertEquals(null, response.getOutput());
    }

    @Test
    public void test_6_returns_fizz() {
        request.setInput(6);
        FizzBuzzResponse response = fizzBangService.fizzBuzzTheRequest(request);
        assertEquals(FIZZ, response.getOutput());
    }

    @Test
    public void test_10_returns_bang() {
        request.setInput(10);
        FizzBuzzResponse response = fizzBangService.fizzBuzzTheRequest(request);
        assertEquals(BUZZ, response.getOutput());
    }

    @Test
    public void test_15_returns_fizzbang() {
        request.setInput(15);
        FizzBuzzResponse response = fizzBangService.fizzBuzzTheRequest(request);
        assertEquals(FIZZ + BUZZ, response.getOutput());
    }

    @Test
    public void test_0_returns_fizzbang() {
        request.setInput(0);
        FizzBuzzResponse response = fizzBangService.fizzBuzzTheRequest(request);
        assertEquals(FIZZ + BUZZ, response.getOutput());
    }

    @Test
    public void test_30_returns_fizzbang() {
        request.setInput(30);
        FizzBuzzResponse response = fizzBangService.fizzBuzzTheRequest(request);
        assertEquals(FIZZ + BUZZ, response.getOutput());
    }
}
