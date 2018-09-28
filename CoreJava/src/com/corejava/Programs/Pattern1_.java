package com.corejava.Programs;

public class Pattern1_ {
	/**
	             *
	             * *         Incremental Triangle Pattern
	             * * *
	             * * * *
	             * * * * *
	 */
	
	
	//row is used for outer loop[How many times loop should executed]
	//columns are used for inner loop[how many times data should be printed]
	
	
	public static void printDiamondTrainglePattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			  System.out.print("* ");	
			}
			System.out.println();
		}
	}
	
	
	/**
	         1
	         1 1
	         1 1 1
	         1 1 1 1
	         1 1 1 1 1
	
	
	 */
	

	public static void printNumericTrianglePattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("1 ");
				
			}
			
			System.out.println();
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		printDiamondTrainglePattern();
		System.out.println("--------------------");
		printNumericTrianglePattern();
	}

}
