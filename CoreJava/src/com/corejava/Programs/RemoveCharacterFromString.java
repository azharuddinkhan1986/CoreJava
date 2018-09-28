package com.corejava.Programs;
/**
 * 
 * Write a method that will remove given character from the String?

We can use replaceAll method to replace all the occurance of a String with another String.
The important point to note is that it accepts String as argument, 
so we will use Character class to create String and use it to replace all the characters with empty String.
 *
 */



public class RemoveCharacterFromString {

	public static void main(String[] args) {
		String text=removeCharacter("Azhar", 'A');
		System.out.println(text);
	}  


	private static String removeCharacter(String str,char c)
	{
		if(str==null)
			return null;
		return str.replaceAll(Character.toString(c),"");

	}



}
