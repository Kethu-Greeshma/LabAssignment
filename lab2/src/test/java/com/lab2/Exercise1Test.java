package com.lab2;

/**Create a method which accepts an array of integer elements and return the second 
 * smallest element in the array
 * Author: Kethu Greeshma
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class Exercise1Test {
	private Exercise1 exercise1;
	//private static int ONE_NUMBER = 0;
	@Before
	public void setup() {
		exercise1 = new Exercise1();
	}
	
	@Test
	public void test_secondSmallest_givenEmptyArray_shouldReturn0AsInteger() {
		int input[] = {};
		int output = exercise1.secondSmallest(input);
		assertEquals(0,output);
	}
	
	@Test
	public void test_secondSmallest_given1ElementArray_shouldReturn0ElementAsInteger() {
		int input[] = {12};
		int output = exercise1.secondSmallest(input);
		assertEquals(0, output);
	}
	
	@Test
	public void test_secondSmallest_given2ElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {21,24};
		int output = exercise1.secondSmallest(input);
		assertEquals(24, output);
	}
	
	@Test
	public void test_secondSmallest_givenNElementArray_shouldReturnOutputAsIntegerArray() {
		int input[] = {21,24,2,4,7};
		int output = exercise1.secondSmallest(input);
		assertEquals(4, output);
	}
}

