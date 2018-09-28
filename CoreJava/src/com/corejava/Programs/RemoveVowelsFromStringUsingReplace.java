package com.corejava.Programs;

import java.util.Scanner;

public class RemoveVowelsFromStringUsingReplace {
	
	
	public static void main(String[] args) {
		
		//Step 1 : Create java.util.Scanner object to take input from the user.
		Scanner sc= new Scanner(System.in);
		//Step 2 : Take inputString from the user.
		String input=sc.nextLine();
		removeVowelsFromString(input);
	}
	
	
	public static void removeVowelsFromString(String input)
	{
		String newString=input.replaceAll("[AEIOUaeiou]","");
		System.out.println(newString);
		
	}

}
