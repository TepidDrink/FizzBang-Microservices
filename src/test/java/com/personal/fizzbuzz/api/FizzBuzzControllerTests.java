package com.personal.fizzbuzz.api;

import com.personal.fizzbuzz.api.schema.NumberRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzControllerTests {

    @Mock
    private FizzBuzzService fizzBangService;

    @InjectMocks
    private FizzBuzzController fizzBangController;

    @Test
    public void testControllerTakesRequestObject() {
        NumberRequest numberRequest = new NumberRequest();
        fizzBangController.processRequest(numberRequest);
    }
}
