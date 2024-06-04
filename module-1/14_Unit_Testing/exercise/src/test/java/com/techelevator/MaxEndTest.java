package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

public class MaxEndTest {

    /*
 * Given an array of ints length 3, figure out which is larger between the first and last elements
 * in the array, and set all the other elements to be that value. Return the changed array.
 */
    private MaxEnd sut;

    @Before
    public void setup() {
        sut = new MaxEnd();
    }
    //Large Difference

    @Test
    public void should_return_3_3_3_when_passed_3_1_3() {
        int [] nums = new int[]{3,2,3};
        Assert.assertArrayEquals(int[]{3,3,3}, sut.makeArray(nums));

    }
    //Same
    @Test
    public void should_return_true_when_passed_2_2_2() {
        int [] nums = new int[]{2,2,2};
        Assert.assertEquals(nums, nums);
        Assert.assertEquals(, sut.makeArray(nums));

    }
    //Negatives
    //0
}
