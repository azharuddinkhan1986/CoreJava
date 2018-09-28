package com.corejava.Programs;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharacterInString {
	
	public void findDuplicateCharacterInString(String str)
	{
	  //Convert this string to character Array
		char[] chars=str.toCharArray();
		
		//Store this character in Hashmap as key and value pair
		HashMap<Character, Integer> charMap=new HashMap<Character,Integer>();
		//All character stores in map as key and count as value
		for(Character ch:chars)
		{
			if(charMap.containsKey(ch))
			{
				//if charcter repeats , increase by 1
				charMap.put(ch,charMap.get(ch)+1);
			}
			else
			{ // if character is unique,
				charMap.put(ch,1);
		    }
		}
		//get all keys
		Set<Character> keys =charMap.keySet();//get all keys
		for(Character ch:keys)
		{   //display only characters which count is greater than 1
			if(charMap.get(ch)>1)
			{   //get key---get key value
				System.out.println(ch+"----"+charMap.get(ch));
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		FindDuplicateCharacterInString obj=new FindDuplicateCharacterInString();
		obj.findDuplicateCharacterInString("azharuddinkhan");
	}
	
	
	
	
	
	

}
