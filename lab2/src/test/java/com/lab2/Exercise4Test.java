package com.lab2;

/**
 * Create a method which accepts an integer array and removes all the duplicates in the array.
 *  Return the resulting array in descending order
 * @author kethu_greeshma
 *
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Exercise4Test {
	
private Exercise4 exercise4;
	
	@Before
	public void setup() {
		exercise4 = new Exercise4();
	}
	
	@Test
	public void test_removeDuplicateAndSort_given0ElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {};
		int output[] = exercise4.getOutputIntegerArray(input);
		assertEquals(0,0);
	}
	
	@Test
	public void test_removeDuplicateAndSort_given1ElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {2};
		int output[] = exercise4.getOutputIntegerArray(input);
		assertEquals(2,output[0]);
	}
	
	@Test
	public void test_removeDuplicateAndSort_given2ElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {3,6};
		int output[] = exercise4.getOutputIntegerArray(input);
		assertEquals(6,output[0]);
	}
	
	@Test
	public void test_removeDuplicateAndSort_givenNElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {1, 56, 3, 7, 89, 56};
		int output[] = exercise4.getOutputIntegerArray(input);
		assertEquals(7, output[2]);
	}
}

