package com.corejava.Programs;
import java.util.Scanner;
public class Reverse {

	
	public static void main1(String[] args) {
		System.out.println("Enter String to Reverse");
		Scanner sc=new Scanner(System.in);
	    String st=sc.next();
		char str[]=st.toCharArray();
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]);
			
		}	
		sc.close();
	}
	

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String st=sc.next();
			//String st = "MyJava";
			char str[]=st.toCharArray();
			for(int i=str.length-1;i>=0;i--)
			{
				System.out.println(str[i]);
				
			}	
			
			
		

	} 

	


}
