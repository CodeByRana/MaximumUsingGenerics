package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    //  Test Case for the Integer where max_Value at First Position
    @Test
    public void given3IntegerValue_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        // Maximum maximum = new Maximum();
        int actualResult = Maximum.getMax(16,15,10);
        int expectedResult = 16;
        Assert.assertEquals(expectedResult,actualResult);
    }
}
