package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringBitsTest {

    /*
 * Given a string, return a new string made of every other char starting with
 * the first, so "Hello" yields "Hlo".
 */
    private StringBits sut;

    @Before
    public void setup() {
        sut = new StringBits();


    }
    @Test
    public void should_lol_true_when_passed_a_string_loollo() {

        Assert.assertEquals("lol", sut.getBits("loollo"));

    }
    @Test
    public void should_aaaaaa_true_when_passed_a_string_aaaaaaaaaa() {

        Assert.assertEquals("aaaaaa", sut.getBits("aaaaaaaaaaa"));

    }
//    @Test
//    public void should_10000_true_when_passed_a_list_of_10000_0_0() {
//        List<Integer> nums = new ArrayList<>();
//        nums.add(10000);
//        nums.add(0);
//        nums.add(0);
//        Assert.assertEquals((Integer)10000, sut.findLargest(nums));
//
//    }
//    @Test
//    public void should_10000_true_when_passed_a_list_of_10000_0_0() {
//        List<Integer> nums = new ArrayList<>();
//        nums.add(10000);
//        nums.add(0);
//        nums.add(0);
//        Assert.assertEquals((Integer)10000, sut.findLargest(nums));
//
//    }
}
