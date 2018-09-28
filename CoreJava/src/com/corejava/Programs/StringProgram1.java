package com.corejava.Programs;

public class StringProgram1 {
	
	public static void main(String[] args) {
		
		String text ="Meraj ahmad khan";
		//output ->   nzhnruddia Kh0a
		text=text.toLowerCase();
		//replace last occurance of character to 0
		String newText=replaceLastOccuranceOfChar(text,'a','0');
		System.out.println(newText);
		
		System.out.println(replace(newText,'a','n').toString());
		
		
	}
	
	private static String replaceLastOccuranceOfChar(String text,char c,char replace)
	{  String newText="";
		if(text.length()<2)
			return "There is only char in String";
		
		else
		{
			newText=text.substring(0,text.lastIndexOf(c))+replace+text.substring(text.lastIndexOf(c)+1);
			
		}
		return newText;
	}
	
	private static StringBuilder replace(String text,char c1,char c2)
	{   StringBuilder sb=new StringBuilder();
		char[] charArray=text.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]=='a')
			{
				charArray[i]='n';
			}
			else if(charArray[i]=='n')
			{
				charArray[i]='a';
			}
			sb.append(charArray[i]);	
		}
		return sb;
		
	}
	

}
