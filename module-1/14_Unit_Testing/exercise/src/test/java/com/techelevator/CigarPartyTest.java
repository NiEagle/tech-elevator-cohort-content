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
    //TESTING WEEKEND IS TRUE
    @Test
    public void testHavePartyMaxRangeWeekend() {

        Assert.assertEquals(true, sut.haveParty(60,true));

    }
    @Test
    public void testHavePartyMinRangeWeekend() {

        Assert.assertEquals(true, sut.haveParty(40,true));

    }
    




}
