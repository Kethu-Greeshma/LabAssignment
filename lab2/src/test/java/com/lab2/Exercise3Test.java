package com.lab2;

/**
 * Create a method which accepts an integer array, reverse the numbers in the array 
 * and returns the resulting array in sorted order
 * @author kethu_greeshma
 *
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Exercise3Test {
	
	private Exercise3 exercise3;
	
	@Before
	public void setup() {
		exercise3 = new Exercise3();
	}
	
	@Test
	public void test_reverseAndSort_given0ElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {};
		int output[] = exercise3.getOutputIntegerArray(input);
		assertEquals(0,0);
	}
	
	@Test
	public void test_reverseAndSort_given1ElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {21};
		int output[] = exercise3.getOutputIntegerArray(input);
		assertEquals(12,output[0]);
	}
	
	@Test
	public void test_reverseAndSort_given2ElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {21, 45};
		int output[] = exercise3.getOutputIntegerArray(input);
		assertEquals(12,output[0]);
	}
	
	@Test
	public void test_reverseAndSort_givenNElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {17, 23, 45, 67, 89, 543};
		int output[] = exercise3.getOutputIntegerArray(input);
		assertEquals(32,output[0]);
	}
}

