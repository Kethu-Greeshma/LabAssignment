package com.lab2;

import java.util.Arrays;

public class Exercise1 {
	
	public int secondSmallest(int[] array) {
		if(array.length==0 || array.length==1){
			return 0;
		}
		else {
			Arrays.sort(array);
			return array[1];
		}
	}
}

