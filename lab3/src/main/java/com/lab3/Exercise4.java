package com.lab3;

public class Exercise4 {
      
	public int getOutputInteger(int number) {
		String string = Integer.toString(number);
		StringBuffer sBuff = new StringBuffer();
		for(int i=0;i<string.length()-1;i++) {
			int cha1 = (int)string.charAt(i);
			int cha2 = (int)string.charAt(i+1);
			int difference = cha1-cha2;
			if(difference<0)
					difference *= -1;
			sBuff.append(difference);
		}
		sBuff.append(string.charAt(string.length()-1));
		int ans = Integer.parseInt(sBuff.toString()); 
		return ans;
	}
}

