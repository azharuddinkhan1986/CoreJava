package com.corejava.Programs;

public class Pattern3_ {
	
	
	/**
					1111111
					1111122
					1111333
					1114444
					1155555
					1666666
					7777777
	 */
	
	
	public static void main(String[] args) {
		printPattern();
	}
	
	public static void printPattern()
	{
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
