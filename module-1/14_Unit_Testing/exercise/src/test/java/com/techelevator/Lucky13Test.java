package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Array;

public class Lucky13Test {

    private Lucky13 sut;

    @Before
    public void setup() {
        sut = new Lucky13();


    }
    //NO 1S OR 3S
    @Test
    public void should_return_true_when_passed_2_2_2() {
        int [] nums = new int[]{2,2,2};
        Assert.assertEquals(true, nums);

    }
    @Test
    public void should_return_true_when_passed_5_2000_8() {
        int [] nums = new int[]{5,20000,8};
        Assert.assertEquals(true, nums);

    }
    @Test
    public void should_return_true_when_passed_zeros() {
        int [] nums = new int[]{0,0,0};
        Assert.assertEquals(true, nums);

    }
    @Test
    public void should_return_true_when_passed_negative_1_negative_3negative_1_() {
        int [] nums = new int[]{-1,-3,-1};
        Assert.assertEquals(true, nums);

    }
    @Test
    public void should_return_true_when_passed_10_30_11() {
        int [] nums = new int[]{10,30,11};
        Assert.assertEquals(true, nums);

    }
    //TEST 1S AND 3S
    @Test
    public void should_return_false_when_passed_only_1s() {
        int [] nums = new int[]{1,1,1};
        Assert.assertEquals(false, nums);

    }
    @Test
    public void should_return_false_when_passed_only_3s() {
        int [] nums = new int[]{3,3,3};
        Assert.assertEquals(false, nums);

    }
    @Test
    public void should_return_false_when_passed_1_2_3s() {
        int [] nums = new int[]{1,2,3};
        Assert.assertEquals(false, nums);

    }
    @Test
    public void should_return_false_when_passed_1_2_2() {
        int [] nums = new int[]{1,2,2};
        Assert.assertEquals(false, nums);

    }
    @Test
    public void should_return_false_when_passed_2_2_3s() {
        int [] nums = new int[]{2,2,3};
        Assert.assertEquals(false, nums);

    }
}
