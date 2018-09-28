package com.corejava.Programs;

import java.util.HashSet;

public class FindDuplicateElementInStringArray {
	
	
	public void findDuplicateElementInStringArray(String [] elements)
	{
		HashSet<String> set= new HashSet<String>();
		for(String element:elements)
		{
			if(!set.add(element))
			{
				System.out.println("Duplicate Element is "+element);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		FindDuplicateElementInStringArray obj=new FindDuplicateElementInStringArray();
		String [] name={"Java","Python","Protractor","Java","C","C++","C++"};
		
		obj.findDuplicateElementInStringArray(name);
		
		
	}

}
