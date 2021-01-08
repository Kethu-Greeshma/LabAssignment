package com.lab3;

import java.util.ArrayList;

public class Exercise1 {
	 public int getSumAndDisplay(String element) {
		 int sum=0;
		 if(element.length()==0)
			 return 0;
		 
		 String string[] = element.split(" ");
		 ArrayList arrL = new ArrayList();
		 
		 for(int i=0;i<string.length;i++) {
				arrL.add(Integer.parseInt(string[i]));
			}
		 
		 for(int i=0;i<arrL.size();i++) {
				System.out.print(arrL.get(i)+" ");
				sum = sum+(int)arrL.get(i);
			}
		 return sum;
	 }
}


