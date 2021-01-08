package com.lab3;

/**
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol
 * Author: Kethu Greeshma 
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Exercise2Test {
	Exercise2 exercise2;
	
	@Before
	public void setup() {
		exercise2 = new Exercise2();
	}
	
	@Test
	public void test_mirrorImage_givenEmptyString_shouldReturnNull() {
		String input = "";
		String output = exercise2.getOutputString(input);
		assertEquals(null,output);
	}
	
	@Test
	public void test_mirrorImage_givenString_shouldReturnOutputString() {
		String input = "GREESH";
		String output = exercise2.getOutputString(input);
		assertEquals("GREESH|HSEERG",output);
	}
}

