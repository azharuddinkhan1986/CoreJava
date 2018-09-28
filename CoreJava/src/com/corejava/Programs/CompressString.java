package com.corejava.Programs;

public class CompressString {
	
	public static void main(String[] args) {
		//Input String
		String stringVar="aaabbccdde";
		//Output String a3b2c2d2e1
		//intial count is 0
		int count=0;
		//get first character of string
		char c=stringVar.charAt(0);
		for(int i=0;i<stringVar.length();i++)
		{
			//it will compare character, if its matched count will increase or it will go to else  block
			if(stringVar.charAt(i)==c)
			{
				count++;
			}
			//it will print that character and count
			else
			{
				System.out.print(c+""+count);
				//reset Count to 1
				count=1;
				//assign character value to based on i value
				c=stringVar.charAt(i);
			}
			
		}
		//since last character and count will print in end 
		System.out.print(c+""+count);
		
		
	}
	
	

}
