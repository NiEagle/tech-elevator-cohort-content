package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * When squirrels get together for a party, they like to have cigars. A squirrel party is successful
 * when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
 * there is no upper bound on the number of cigars. Return true if the party with the given values is
 * successful, or false otherwise.
 */
public class CigarPartyTest {

    private CigarParty  sut;

  @Before
    public void setup(){
        sut = new CigarParty();

    }
//isWEEKEND IS TRUE
   //TESTING CIGARS WITHIN RANGE
    @Test
    public void should_return_true_when_passed_maximum_range_of_60_and_isWeekend_is_true() {

        Assert.assertEquals(true, sut.haveParty(60,true));

    }
    @Test
    public void should_return_true_when_passed_minimum_range_of_40_and_isWeekend_is_true() {

        Assert.assertEquals(true, sut.haveParty(40,true));

    }
    @Test
    public void should_return_true_when_passed_45_and_isWeekend_is_true() {

        Assert.assertEquals(true, sut.haveParty(45,true));

    }
    //TESTING CIGARS IS OUT OF RANGE WEEKEND IS TRUE EXPECT FALSE
    @Test
   //TEST CIGARS OUT OF RANGE
    public void should_return_false_when_passed_0_and_isWeekend_is_true() {

        Assert.assertEquals(false, sut.haveParty(0,true));
    }
    @Test
    public void should_return_false_when_passed_1_and_isWeekend_is_true() {

        Assert.assertEquals(false, sut.haveParty(1,true));

    }
    @Test
    public void should_return_true_when_passed_999_and_isWeekend_is_true() {

        Assert.assertEquals(true, sut.haveParty(999,true));

    }
//isWeekend IS FALSE
    //TESTING CIGARS WITHIN RANGE
    @Test
    public void should_return_true_when_passed_maximum_range_of_60_and_isWeekend_is_false() {

    Assert.assertEquals(true, sut.haveParty(60,false));

}
    @Test
    public void should_return_true_when_passed_minimum_range_of_40_and_isWeekend_is_false() {

        Assert.assertEquals(true, sut.haveParty(40,false));

    }
    @Test
    public void should_return_true_when_passed_45_and_isWeekend_is_false() {

        Assert.assertEquals(true, sut.haveParty(45,false));

    }
    //TESTING CIGARS IS OUT OF RANGE WEEKEND IS TRUE EXPECT FALSE
    @Test
    //TEST CIGARS OUT OF RANGE
    public void should_return_false_when_passed_0_and_isWeekend_is_false() {

        Assert.assertEquals(false, sut.haveParty(0,false));
    }
    @Test
    public void should_return_false_when_passed_1_and_isWeekend_is_false() {

        Assert.assertEquals(false, sut.haveParty(1,false));

    }
    @Test
    public void should_return_false_when_passed_999_and_isWeekend_is_false() {

        Assert.assertEquals(false, sut.haveParty(999,false));

    }


}
