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
//    Assert.assertEquals(3,sut.findLargest(1,2,3));

    }
}