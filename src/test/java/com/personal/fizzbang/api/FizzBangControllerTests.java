package com.personal.fizzbang.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class FizzBangControllerTests {

    @Mock
    private FizzBangService fizzBangService;

    @InjectMocks
    private FizzBangController fizzBangController;

    @Test
    public void testControllerReturnsFizz() {
        assertNull(fizzBangController.processRequest(null));
    }

    @Test
    public void testControllerTakesRequestObject() {
        NumberRequest numberRequest = new NumberRequest();
        fizzBangController.processRequest(numberRequest);
    }
}
