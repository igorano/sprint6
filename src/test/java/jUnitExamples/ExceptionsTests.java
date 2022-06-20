package jUnitExamples;

import org.junit.Test;

public class ExceptionsTests {
    @Test(expected = NullPointerException.class)
    public void whenExceptionThrown_thenExpectationSatisfied() {
        String test = null;
        test.length();
    }
}
