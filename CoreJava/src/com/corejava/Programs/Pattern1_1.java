package com.corejava.Programs;

public class Pattern1_1 {
	/*

	//How to print the following pattern using Java Program?

				*
				***
				ABCDEF
				***
				*
	
	*/

	
	/* public static void main(String args[])
	    {
	        int i, j, k=1;
	       
	        for(i=0; i<2; i++)
	        {
	            for(j=0; j<k; j++)
	            {
	                System.out.print("*");
	            }
	            k = k + 2;
	            System.out.println();
	        }
	        
	        //System.out.println("ABCDEF");
	        
	        for(j=0;j<2;j++){
		        for(i=3;i>1;i--)
		        {
		        	System.out.print("*");
		        }
	        }
	        
	        
	    }*/
	
	
	public static void main(String args[])
	{
	int i,j;
	for(i=0;i<5;i++) 
	{ 
		for(j=i; j<3; j++) 
		{ 
			System.out.print("*"); 
		
		} 
		System.out.println(); 
		}
	} 
	
	

}
