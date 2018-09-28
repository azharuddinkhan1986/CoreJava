package com.corejava.Programs;

public class ReverseStringUsingStringBufferClass {
	
	public StringBuffer reverseStringUsingStringBuffer(String text)
	{
		StringBuffer sbf=new StringBuffer(text);
		
		return sbf.reverse();
	}
	
	
	
	public static void main(String[] args) {
		
		ReverseStringUsingStringBufferClass obj=new ReverseStringUsingStringBufferClass();
		String text="AzharuddinKhan";
		StringBuffer result = obj.reverseStringUsingStringBuffer(text);
		System.out.println(result);
	}

}
