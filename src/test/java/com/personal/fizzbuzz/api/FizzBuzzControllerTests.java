package com.personal.fizzbuzz.api;

import com.personal.fizzbuzz.api.schema.NumberRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzControllerTests {

    @Mock
    private FizzBuzzService fizzBuzzService;

    @InjectMocks
    private FizzBuzzController fizzBuzzController;

    @Test
    public void testControllerTakesRequestObject() {
        fizzBuzzController.processRequest(new NumberRequest());
    }

    @Test
    public void testControllerAllOtherEndpointMethodReturnsException() {
        FizzBuzzController.BadRequestException badRequestException = fizzBuzzController.processRequestWrongEndpoint(new NumberRequest());
        assertNotNull(badRequestException);
    }

    @Test
    public void testExceptionHandlerMethodReturnsException() {
        FizzBuzzController.BadRequestException badRequestException = fizzBuzzController.handleAllExceptions(new Exception());
        assertNotNull(badRequestException);
    }
}
