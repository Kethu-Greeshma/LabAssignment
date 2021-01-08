package com.lab2;

import java.util.Arrays;

public class Exercise3 {
	  
	public int[] getOutputIntegerArray(int[] array) {
		int answer[] = new int[array.length];
		if(array.length == 0)
				return answer;
		else{
			for(int i=0;i<array.length;i++) {
				StringBuilder string = new StringBuilder(Integer.toString(array[i]));
				string = string.reverse();
				answer[i] = Integer.parseInt(string.toString());
			}
			Arrays.sort(answer);
		}
		return answer;
	}
}

