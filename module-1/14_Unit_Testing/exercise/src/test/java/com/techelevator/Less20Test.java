package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {
    /*
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
 * and 39 return true, but 40 returns false.
 */
    private Less20 sut;

    @Before
    public void setup() {
        sut = new Less20();


    }
    //TEST IN RANGE AND TRUE

    @Test
    public void should_return_true_when_passed_78_and_isWeekend_is_true() {

        Assert.assertEquals(true, sut.isLessThanMultipleOf20(78));

    }
    public void should_return_true_when_passed_998_and_isWeekend_is_true() {

        Assert.assertEquals(true, sut.isLessThanMultipleOf20(998));

    }
//FALSE
    @Test
    public void should_return_false_when_passed_3() {

    Assert.assertEquals(false, sut.isLessThanMultipleOf20(3));
    }
    @Test
    public void should_return_false_when_passed_0() {

        Assert.assertEquals(false, sut.isLessThanMultipleOf20(0));

    }
    @Test
    public void should_return_false_when_passed_20() {

        Assert.assertEquals(false, sut.isLessThanMultipleOf20(20));

    }

}
