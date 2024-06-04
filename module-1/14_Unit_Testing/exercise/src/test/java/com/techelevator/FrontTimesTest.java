package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {

    /*
 * Given a string and a non-negative int n, we'll say that the front of the
 * string is the first 3 chars, or whatever is there if the string is less than
 * length 3. Return n copies of the front.
 */
    private FrontTimes sut;

    @Before
    public void setup() {
        sut = new FrontTimes();


    }

    @Test
    public void should_return_PetPetPet_a_when_passed_Peter_and_3() {

        Assert.assertEquals("PetPetPet", sut.generateString("Peter",3));

    }
    @Test

    public void should_return_lollollollollollollollollol_when_passed_lol_and_0() {

        Assert.assertEquals("lollollollollollollollollol", sut.generateString("lol",9));

    }
    @Test
    public void should_return_hi_when_passed_hi_and_1() {

        Assert.assertEquals("hi", sut.generateString("hi",1));

    }



   //EDGE
   @Test
   public void should_return_nothing_when_passed_hi_and_negative_0() {

       Assert.assertEquals("", sut.generateString("hi",0));

   }
    @Test
    public void should_return_nothing_when_passed_hi_and_negative_1() {

        Assert.assertEquals("", sut.generateString("hi",-1));

    }
    @Test
    public void should_return_100_a_when_passed_a_and_100() {

        Assert.assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", sut.generateString("a",100));

    }
    @Test
    public void should_return_null_a_when_passed_null_and_100() {

    }

}
