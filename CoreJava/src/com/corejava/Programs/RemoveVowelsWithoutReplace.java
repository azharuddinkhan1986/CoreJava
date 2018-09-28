package com.corejava.Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveVowelsWithoutReplace {


	public static void main(String[] args) {

		//Step 1 : Create java.util.Scanner object to take input from the user.
		Scanner sc= new Scanner(System.in);
		//Step 2 : Take inputString from the user.
		String input=sc.nextLine();
		removeVowelsUsingHashset(input);
		removeVowelsUsingArrayList(input);
        sc.close();
	}

	private static void removeVowelsUsingHashset(String input) {
		
		Set<Character> vowelsSet = new HashSet<Character>();
		vowelsSet.add('A');
		vowelsSet.add('E');
		vowelsSet.add('I');
		vowelsSet.add('O');
		vowelsSet.add('U');
		vowelsSet.add('a');
		vowelsSet.add('e');
		vowelsSet.add('i');
		vowelsSet.add('o');
		vowelsSet.add('u');
		
		StringBuffer strBuff=new StringBuffer();
		char[] charArray=input.toCharArray();
		for(Character chr:charArray)
		{
			if(!vowelsSet.contains(chr))
			{
				strBuff.append(chr);
			}
			
		}
		System.out.println("Original String is : " + input);
		System.out.println("Buffered String is : " + strBuff);
		
		
		
	}
	
	private static void removeVowelsUsingArrayList(String input)
	{
		List<Character> list=new ArrayList<Character>();
		list.add('A');
		list.add('E');
		list.add('I');
		list.add('O');
		list.add('U');
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<input.length();++i)
		{
			char ch=input.charAt(i);
			if(!list.contains(ch))
			{
				sb.append(ch);
				
			}
		}
		System.out.println(sb.toString());
		
	}

}
