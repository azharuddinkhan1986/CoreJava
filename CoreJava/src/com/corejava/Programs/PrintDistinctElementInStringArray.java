package com.corejava.Programs;

public class PrintDistinctElementInStringArray {
	
	public static void main(String[] args) {
		String[] names={"Azhar","meraj","meraj","khan","Rama","khan"};
		for(int i=0;i<names.length;i++)
		{
			boolean isDistinct=false;
			for(int j=0;j<i;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					isDistinct=true;
					break;
				}
			}
			if(!isDistinct)
			{
				System.out.print(names[i]+" ");
			}
			
		}
		}

}
