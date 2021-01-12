package com.lab3;

public class Exercise8 {
	public boolean getOutputBooleanCase(String string) {
		if(string.length()==0)
			return false;
		for(int i=0;i<string.length()-1;i++) {
			int one = (int)string.charAt(i);
			int two = (int)string.charAt(i+1);
			if(one>two)
				return false;
		}
		return true;
	}
}

