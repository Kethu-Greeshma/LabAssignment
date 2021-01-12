package com.lab3;

import java.util.Scanner;

/**
 * : Create a method to accept date and print the duration in days, months and years with regards to current system date.
 * @author kethu_greeshma
 *
 */
public class Exercise9 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String str = sca.nextLine();
		printDate(str);
	}
	

	private static void printDate(String str) {
		String str1[] = str.split("/");	
		System.out.println("Number of days "+str1[0]);
		if(str1[1].equals("01")) {
			System.out.println("Month is January");
		}
		else if(str1[1].equals("02")) {
			System.out.println("Month is February");
		}
		else if(str1[1].equals("03")) {
			System.out.println("Month is March");
		}else if(str1[1].equals("04")) {
			System.out.println("Month is April");
		}else if(str1[1].equals("05")) {
			System.out.println("Month is May");
		}else if(str1[1].equals("06")) {
			System.out.println("Month is June");
		}else if(str1[1].equals("07")) {
			System.out.println("Month is July");
		}else if(str1[1].equals("08")) {
			System.out.println("Month is August");
		}else if(str1[1].equals("09")) {
			System.out.println("Month is September");
		}else if(str1[1].equals("10")) {
			System.out.println("Month is October");
		}else if(str1[1].equals("11")) {
			System.out.println("Month is November");
		}else if(str1[1].equals("12")) {
			System.out.println("Month is December");
		}
		
		System.out.println("Year is "+str1[2]);
		
	}
}
