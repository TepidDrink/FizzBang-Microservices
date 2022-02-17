package com.personal.fizzbang.api;

import com.personal.fizzbang.api.schema.NumberRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FizzBangControllerTests {

    @Mock
    private FizzBangService fizzBangService;

    @InjectMocks
    private FizzBangController fizzBangController;

    @Test
    public void testControllerTakesRequestObject() {
        NumberRequest numberRequest = new NumberRequest();
        fizzBangController.processRequest(numberRequest);
    }
}
