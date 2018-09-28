package com.corejava.Programs;

public class PrintDistinctElementInCharacterArray {
	
	//Print Distinct Element from Character Array
	//
	public static void main(String[] args) {
		
		char[] chars={'A','B','D','A','F','Z','Z'};
		for(int i=0;i<chars.length;i++)
		{
			boolean isDistinct=false;
			for(int j=0; j<i;j++)
			{
				if(chars[i]==chars[j])
				{
					isDistinct=true;
					break;
				}
			}
			if(!isDistinct)
			{
				System.out.print(chars[i]+",");
			}
		}
		
		
	}

}
