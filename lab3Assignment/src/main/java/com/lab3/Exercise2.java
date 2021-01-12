package com.lab3;

public class Exercise2 {
	
	public String getOutputString(String string) {
		if(string.length()==0)
			return null;
		StringBuffer sBuff = new StringBuffer(string);
		sBuff = sBuff.reverse();
		return (string+"|"+sBuff.toString());
	}
}

