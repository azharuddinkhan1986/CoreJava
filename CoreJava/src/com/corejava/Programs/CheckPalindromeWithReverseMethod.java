package com.corejava.Programs;

public class CheckPalindromeWithReverseMethod {
	
	
	public static void main(String[] args) {
	    //Check String is Palindrome or not by using String Builder
		System.out.println(isPalindromeUsingStringBuilder("abak"));
	    //Check String is Palindrome or not by using String Builder
		System.out.println(isPalindromeUsingStringBuffer("aba"));
	
	}
	
	private static boolean isPalindromeUsingStringBuffer(String str) {
		if(str==null)
			return false;
		//String Buffer 
		StringBuffer strBuffer=new StringBuffer(str);
		strBuffer.reverse();
		return strBuffer.toString().equals(str);
	}

	/**
	 * A String is said to be Palindrome if it’s value is same when reversed. 
	 * For example “aba” is a Palindrome String.
       String class doesn’t provide any method to reverse the String ,
       but StringBuffer and StringBuilder class has reverse method that we can use to check ,
       if String is palindrome or not.
	 * @param str
	 * @return
	 */

	private static boolean isPalindromeUsingStringBuilder(String str) {
		if(str==null)
			return false;
		//String Builder
		StringBuilder strBuilder=new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
		
	}

}
