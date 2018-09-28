package com.corejava.Programs;

public class PrintDistinctElementInIntegerArray {
	
	
	public static void main(String[] args) {
		
		int[] array={1,1,5,10,8,9,10,10};
		
		for(int i=0;i<array.length;i++)
		{
			boolean isDistinct=false;
			for(int j=0;j<i;j++)
			{
				if(array[i]==array[j])
				{
					isDistinct=true;
					break;
				}
			}
			if(!isDistinct)
			{
				System.out.print(array[i]+",");
			}
		}
			
	}

}
