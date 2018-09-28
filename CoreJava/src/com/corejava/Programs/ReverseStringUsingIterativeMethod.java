package com.corejava.Programs;

public class ReverseStringUsingIterativeMethod {
	
	
	public void reverseStringWithIterativeApproach(String text)
	{
		//Convert String into char array
		char[] charArray=text.toCharArray();
		//Iterate char array into reverse order to get reverse string of actual string
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ReverseStringUsingIterativeMethod obj=new ReverseStringUsingIterativeMethod();
		obj.reverseStringWithIterativeApproach("Azharuddin");
	}

}
