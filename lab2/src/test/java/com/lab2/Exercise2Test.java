package com.lab2;

/**
 * Create a method that can accept an array of String objects and sort in alphabetical 
 * order. The elements in the left half should be completely in uppercase and the 
 * elements in the right half should be completely in lower case.
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class Exercise2Test {

	private Exercise2 exercise2;
	
	@Before
	public void setup() {
		exercise2 = new Exercise2();
	}
	
	@Test
	public void test_sortAndConversion_givenEmptyArrayString_shouldReturnNullAsString() {
		String input[] = {};
		String output[] = exercise2.getOutputString(input);
		assertEquals(null,output);
	}
	
	@Test
	public void test_sortAndConversion_given1ElementArrayString_shouldReturnStringArrayAsOutput() {
		String input[] = {"a"};
		String output[] = exercise2.getOutputString(input);
		assertEquals("A",output[0]);
	}
	
	@Test
	public void test_sortAndConversion_given2ElementArrayString_shouldReturnStringArrayAsOutput() {
		String input[] = {"ab","bc"};
		String output[] = exercise2.getOutputString(input);
		assertEquals("bc",output[1]);
	}
	
	@Test
	public void test_sortAndConversion_givenNElementArrayString_shouldReturnStringArrayAsOutput() {
		String input[] = {"ab","bc","cd","de","ef"};
		String output[] = exercise2.getOutputString(input);
		assertEquals("AB",output[0]);
	}
}

