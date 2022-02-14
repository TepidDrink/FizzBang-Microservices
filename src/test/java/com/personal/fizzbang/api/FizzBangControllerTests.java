package com.personal.fizzbang.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FizzBangControllerTests {

    @InjectMocks
    private FizzBangController fizzBangController;

    @Test
    public void testControllerReturnsFizz() {
        assertEquals("fizz", fizzBangController.processRequest());
    }
}
