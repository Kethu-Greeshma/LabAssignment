package com.lab3;

/**
 * Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, if on moving from left to right each character 
 * in the String comes after the previous characters in the Alphabetical order
 * Author: Kethu Greeshma
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Exercise8Test {
	
 Exercise8 exercise8;
	
	@Before
	public void setup() {
		exercise8 = new Exercise8();
	}
	
	@Test
	public void test_PositiveString_giveEmptyString_shouldReturnBooleanCaseAsOutput() {
		String input = "";
		boolean output = exercise8.getOutputBooleanCase(input);
		assertEquals(false,output);
	}
	
	@Test
	public void test_PositiveString_givenAString_shouldReturnBooleanCaseAsOutput() {
		String input = "ANT";
		boolean output = exercise8.getOutputBooleanCase(input);
		assertEquals(true,output);
	}

}

