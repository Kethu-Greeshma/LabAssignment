package com.lab3;

/**
 * Create a method that accepts a number and modifies it such that the each of the digit in 
 * the newly formed number is equal to the difference between two consecutive digits in the 
 * original number. The digit in the units place can be left as it is. 
 * Author: Kethu Greeshma
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Exercise4Test {
	
	Exercise4 exercise4;
	
	@Before
	public void setup() {
		exercise4 = new Exercise4();
	}
	
	@Test
	public void test_consecutiveModify_given0AsInteger_shouldReturn0AsOutputInteger() {
		int input = 0;
		int output = exercise4.getOutputInteger(input);
		assertEquals(0,output);
	}
	
	@Test
	public void test_consecutiveModify_givenInteger_shouldReturnOutputAsInteger() {
		int input = 45862;
		int output = exercise4.getOutputInteger(input);
		assertEquals(13242,output);
	}
}

