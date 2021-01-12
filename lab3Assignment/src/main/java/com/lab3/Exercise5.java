package com.lab3;

import java.util.Scanner;

/**
 * : Write a Java program that displays the number of characters, lines and words in a text? 
 * *****************Displaying the number of characters********************
 * @author kethu_greeshma
 *
 */
public class Exercise5 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String str = sca.nextLine();
		int answer = countCharacters(str);
		System.out.println(answer);

	}

	private static int countCharacters(String str) {
		// TODO Auto-generated method stub
		String str1[] = str.split(" ");
		int count=0;
		for(int i=0;i<str1.length;i++) {
			String che = str1[i];
			for(int j=0;j<che.length();j++) {
				count = count+1;
			}
		}
		return count;
	}

}
