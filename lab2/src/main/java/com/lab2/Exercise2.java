package com.lab2;

import java.util.Arrays;

public class Exercise2 {

	public String[] getOutputString(String[] array) {
		String output[] = new String[array.length];
		
		if(array.length==0)
			return null;
		
		Arrays.sort(array);
		if(array.length%2==0){
			for(int i=0;i<array.length/2;i++) {
				output[i] = array[i].toUpperCase();
			}
			for(int i=array.length/2;i<array.length;i++) {
				output[i] = array[i].toLowerCase();
			}
		}
		
		else{
			for(int i=0;i<array.length/2+1;i++) {
				output[i] = array[i].toUpperCase();
			}
			for(int i=array.length/2+1;i<array.length;i++) {
				output[i] = array[i].toLowerCase();
			}
		}
		return output;
	}
}

