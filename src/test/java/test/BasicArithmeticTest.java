package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicArithmeticTest {

    @Test
    public void testAddition() {
	WeekOne test = new WeekOne();
	int result = test.addition(3, 4);
	assertEquals(7, result);
    }
    
    @Test
    public void testSubstraction() {
	WeekOne test = new WeekOne();
	int result = test.substraction(3, 4);
	assertEquals(7, result);
    }
    
    @Test
    public void testMultiply() {
	WeekOne test = new WeekOne();
	int result = test.multiply(3, 4);
	assertEquals(12, result);
    }
    
    @Test
    public void testDivision() {
	WeekOne test = new WeekOne();
	// Watch out!
	int result = test.division(5, 2);
	assertEquals(2, result);
    }

}
