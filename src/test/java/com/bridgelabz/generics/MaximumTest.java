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
    //  Test Case for the Integer where max_Value at Second Position
    @Test
    public void given3IntegerValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        int actualResult = Maximum . getMax(10,15,11);
        int expectedResult = 15;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //  Test Case for the Integer where max_Value at Third Position
    @Test
    public void given3IntegerValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        int actualResult = Maximum . getMax(11,10,12);
        int expectedResult = 12;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //Test Case for the Float where max_Value at First Position
    @Test
    public void given3FloatValue_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Float actualResult = Maximum . getMax(15.6f,10.5f,11.5f);
        Float expectedResult = 15.6f;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //  Test Case for the Float where max_Value at Second Position
    @Test
    public void given3FloatValue_Case2_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Float actualResult = Maximum . getMax(11.1f,12.5f,10.6f);
        Float expectedResult = 12.5f;
        Assert.assertEquals(expectedResult,actualResult);
    }
    //  Test Case for the Float where max_Value at Third Position
    @Test
    public void given3FloatValue_Case3_WhenGetMaximumNO_ShouldReturnCorrectMaxValue() {
        Float actualResult = Maximum . getMax(10.5f,15.6f,16.5f);
        Float expectedResult = 16.5f;
        Assert.assertEquals(expectedResult,actualResult);
    }

}
