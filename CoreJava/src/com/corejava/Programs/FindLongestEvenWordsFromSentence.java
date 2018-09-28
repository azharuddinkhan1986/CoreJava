package com.corejava.Programs;

public class FindLongestEvenWordsFromSentence {
	
	
	public static void main(String[] args) {
		
		      String sentence="AutomationTEST This finds extras is longi long azharuddkha AutomationTESTER azharuddin";
		      String[] wordsArry=sentence.split(" ");
		      String newWord=wordsArry[0];
		      for(int i=1;i<wordsArry.length;i++)
		      {
		    	  if(wordsArry[i].length()%2==0&&wordsArry[i].length()>newWord.length())
		    	  {
		    		  newWord=wordsArry[i];
		    	  }
		      }
		
		      System.out.println(newWord);
		
		
	}
	
	
	
	

}
