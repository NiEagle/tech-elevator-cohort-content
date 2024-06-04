package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.crypto.Data;

/*
 * You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
 * of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
 * getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
 * stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of
 * 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
 */

public class DataFashionTest {

    private DateFashion  sut;

    @Before
    public void setup(){
        sut = new DateFashion();

    }


    //TESTING WHEN 2 IS EXPECTED
    @Test
    public void should_return_2_when_passed_10_and_of_10(){

        Assert.assertEquals(2,sut.getATable(10,10));

    }
    @Test
    public void should_return_2_when_passed_10_and_of_3() {

        Assert.assertEquals(2,sut.getATable(10,3));

    }
    @Test
    public void should_return_2_when_passed_3_and_10() {

        Assert.assertEquals(2,sut.getATable(3,10));

    }
    @Test
    public void should_return_2_when_passed_8_and_3(){

        Assert.assertEquals(2,sut.getATable(8,3));

    }
    @Test
    public void should_return_2_when_passed_3_and_8() {

        Assert.assertEquals(2,sut.getATable(3,8));

    }
    //TESTING WHEN 1 IS EXPECTED
    @Test
    public void should_return_1_when_passed_3_and_7() {

        Assert.assertEquals(1,sut.getATable(3,7));

    }
    @Test
    public void should_return_1_when_passed_5_and_5() {

        Assert.assertEquals(1,sut.getATable(5,5));

    }

    //TESTING WHEN 0 IS EXPECTED
    @Test
    public void should_return_0_when_passed_0_and_0() {

        Assert.assertEquals(0,sut.getATable(0,0));

    }
    @Test
    public void should_return_0_when_passed_2_and_10() {

        Assert.assertEquals(0,sut.getATable(2,10));

    }
    @Test
    public void should_return_0_when_passed_0_and_of_2() {

        Assert.assertEquals(0,sut.getATable(0,2));

    }
    //EDGE
    @Test
    public void should_return_0_when_passed_999_and_0() {

        Assert.assertEquals(0,sut.getATable(999,0));

    }
    @Test
    public void should_return_0_when_passed_0_and_999() {

        Assert.assertEquals(0,sut.getATable(0,999));

    }


}
