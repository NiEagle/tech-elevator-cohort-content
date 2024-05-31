package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setup(){
        calc = new Calculator();

    }
    @Test
    public void testAddingTwoPositiveNumbers(){
        //ARRANGE
        //ACT (SUT - SYSTEM UNDER TEST)

        //ASSERT
        Assert.assertEquals(3, calc.add(1,2));
        Assert.assertEquals(25, calc.add(5,20));
        Assert.assertEquals(30, calc.add(15,15));

    }


    @Test
    public void testAddingTwoNegativeNumbers(){
        Assert.assertEquals(-3, calc.add(-1,-2));
        Assert.assertEquals(-25, calc.add(-5,-20));
        Assert.assertEquals(-30, calc.add(-15,-15));

    }
    public void testAddingOneNegativeOnePossitive(){
        Assert.assertEquals(1, calc.add(-1,2));
        Assert.assertEquals(15, calc.add(-5,20));
        Assert.assertEquals(0, calc.add(-15,15));

    }
    public void testAddingZeros(){
        Assert.assertEquals(2, calc.add(0,2));
        Assert.assertEquals(-5, calc.add(-5,0));
        Assert.assertEquals(0, calc.add(0,0));

    }
//testAddingTwoObjectsPositiveNumbers
    @Test
    public void testAddingTwoObjectsPositiveNumbers(){
        //ARRANGE
        Request one = new Request(1,2);
        Request two = new Request(5,10);

        //  Act(calling system)
        Result rOne = calc.add(one);
        Result rTwo = calc.add(two);
        //
        Assert.assertEquals("WRONG AND DISAPPOINTING " + rOne.getResult(), 3,rOne.getResult());
        Assert.assertEquals(15,rTwo.getResult());

    }


    @Test
    public void testNothing(){}

    @Test
    public void testSomthing(){

        }


        @Test
        public void testIsNull(){
        Assert.assertNull(calc.);

        }
    @After
    public void tearDown(){


        System.out.println("After");

    }




}
