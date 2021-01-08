package com.lab3;

public class Exercise3 extends Exercise2 {
	
	public String getOutputString(String string) {
		String answer = "";
		if(string.length()==0) {
			return null;
		}
		else {
			for(int i=0;i<string.length();i++) {
				char ch = string.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || 
						ch=='O' || ch=='U') {
					answer += ch;
					continue;
				}
				else {
					int count = (int)ch;
					if(count==90 || count==122)
						count -= 26;
					count += 1;
					answer += (char)count;
				}
			}
		}
		return answer;
	}

}

