package com.corejava.Programs;

public class ReverseStringUsingStringBuilder {
	
	
	public static void main(String[] args) {
		String name="azhar";
		StringBuilder sb=new StringBuilder(name);
		sb=sb.reverse();
		System.out.println(sb);	
	}

}
