package com.corejava.Programs;

public class CheckPalindromeOfStringWithoutInbuiltMethod {
	
	
	public static void main(String[] args) {
		boolean result=isStringPalindrome("azhar");
		System.out.println(result);
	}
	
	
	/***
	 * Sometimes interviewer asks not to use any other class to check this,
	 * in that case we can compare characters in the String from both ends to find out if it’s palindrome or not.
	 * @param str
	 * @return
	 */
	private static boolean  isStringPalindrome(String str)
	{
		if(str==null)
			return false;
		//get length of String 
		int length=str.length();
		System.out.println(length);
		System.out.println("Check Length/2"+length/2);
		for(int i=0;i<length/2;i++)
		{
			if(str.charAt(i)!=str.charAt(length-i-1))
				return false;
		}
		return true;
	}

}
