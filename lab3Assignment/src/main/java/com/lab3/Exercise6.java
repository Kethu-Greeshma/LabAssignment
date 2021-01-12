package com.lab3;

import java.util.Scanner;

/**
 * : Write a Java program that displays the number of characters, lines and words in a text? 
 * *****************Displaying the number of lines********************
 * @author kethu_greeshma
 *
 */
public class Exercise6 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int count=0;
		while(sca.hasNextLine()) {
			count++;
			sca.nextLine();
		}
		System.out.println(count);
	}

}
