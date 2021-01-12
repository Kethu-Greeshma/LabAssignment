package com.lab3;

/**
 * Write a Java program that reads a line of integers and then displays each integer and the 
 * sum of all integers. (Use String Tokenizer class)?
 * @author kethu_greeshma
 *
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Exercise1Test {
private Exercise1 exercise1;
	
	@Before
	public void setup() {
		exercise1 = new Exercise1();
	}
	
	@Test
	public void test_displayAndSum_givenNullString_shouldReturnOutputAsInteger() {
		String input = "";
		int output = exercise1.getSumAndDisplay(input);
		assertEquals(0,output);
	}
	
	@Test
	public void test_displayAndSum_given1ElementString_shouldReturnOutputAsInteger() {
		String input = "1";
		int output = exercise1.getSumAndDisplay(input);
		assertEquals(1,output);
	}
	
	@Test
	public void test_displayAndSum_given2ElementString_shouldReturnOutputAsInteger() {
		String input = "12 2";
		int output = exercise1.getSumAndDisplay(input);
		assertEquals(14,output);
	}
	
	@Test
	public void test_displayAndSum_givenNElementString_shouldReturnOutputAsInteger() {
		String input = "1 2 3 4";
		int output = exercise1.getSumAndDisplay(input);
		assertEquals(10,output);
	}
}


