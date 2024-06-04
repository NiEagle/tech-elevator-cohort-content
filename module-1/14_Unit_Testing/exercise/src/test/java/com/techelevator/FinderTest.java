package com.techelevator;

import com.sun.jdi.Value;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FinderTest {
    private Finder sut;

    @Before
    public void setup() {
        sut = new Finder();


    }
    @Test
    public void should_3_true_when_passed_maximum_range_of_60_and_isWeekend_is_true() {
    List<Integer> nums = new ArrayList<>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    Assert.assertEquals((Integer)3, sut.findLargest(nums));

    }
    @Test
    public void should_negative_1_true_when_passed_negatives_1_2_3() {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(-2);
        nums.add(-3);
        Assert.assertEquals((Integer)(-1), sut.findLargest(nums));

    }
    @Test
    public void should_0_true_when_passed_a_list_of_zeros() {
        List<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(0);
        nums.add(0);
        Assert.assertEquals((Integer)0, sut.findLargest(nums));

    }
    //EDGE

    @Test
    public void should_10000_true_when_passed_a_list_of_10000_0_0() {
        List<Integer> nums = new ArrayList<>();
        nums.add(10000);
        nums.add(0);
        nums.add(0);
        Assert.assertEquals((Integer)10000, sut.findLargest(nums));

    }
}