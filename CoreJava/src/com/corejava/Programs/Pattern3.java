package com.corejava.Programs;

/**
 * 
 * @author SESA443020
 *      1
 *      2 3
 *      4 5 6
 *      7 8 9 10
 *
 */


public class Pattern3 {
	
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
		      if(i==j)
		      {
		    	  System.out.print(i);
		    	  System.out.println();
		      }else
		      {
		    	  System.out.print(++i);
		      }
		      
			}
			
		}
		
	}
	

}
