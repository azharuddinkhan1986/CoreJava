package com.corejava.Programs;

public class FindCommonCharcterBetweenTwoCharcaterArray {
	
	
	public static void main(String[] args) {
		
		char[] array1 = {'a','b','c','d'};
		char[] array2 = {'z','a','b','c','i'};
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j]){
				System.out.print(array1[i]+",");
				}
				
			}
			
		}
		
		
	}

}
