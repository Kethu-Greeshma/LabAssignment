package com.lab3;

/**Create a method which accepts a String and replaces all the consonants in the String with
 *  the next alphabet
 * Author: Kethu Greeshma
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Exercise3Test {

Exercise2 exercise3;
	
	@Before
	public void setup() {
		exercise3 = new Exercise3();
	}
	
	@Test
	public void test_replacingConsonants_givenEmptyString_shouldReturnOutputString() {
		String input = "";
		String output = exercise3.getOutputString(input);
		assertEquals(null,output);
	}
	
	@Test
	public void test_replacingConsonants_givenAString_shouldReturnOutputString() {
		String input = "JAVA";
		String output = exercise3.getOutputString(input);
		assertEquals("KAWA",output);
	}
}

