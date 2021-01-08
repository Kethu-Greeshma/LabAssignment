package com.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise4 {
	 public int[] getOutputIntegerArray(int[] array) {
		 ArrayList<Integer> arrL = new ArrayList<Integer>();
		 
		 for(int i=0;i<array.length;i++) {
				if(!arrL.contains(array[i])) {
					arrL.add(array[i]);
				}
			}
			int answer[] = new int[arrL.size()];
			Collections.sort(arrL);
			int count=0;
			for(int i=arrL.size()-1;i>=0;i--) {
				answer[count++] = (int) arrL.get(i);
			}
			return answer;
	 }
}

