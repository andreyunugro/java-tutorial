package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class IfElseTest {

    @Test
    public void testAddition() {
	WeekOne test = new WeekOne();
	int result = test.addition(3, 4);
	assertEquals(7, result);
    }
    
    @Test
    public void testNoMoreThanHundred() {
	WeekOne test = new WeekOne();
	try{
	    int result = test.addition(100, 1);
	    fail("expected IllegalArgumentException");
	} catch(IllegalArgumentException e){
	    //ignore, this exception is expected.
	}
    }

}
