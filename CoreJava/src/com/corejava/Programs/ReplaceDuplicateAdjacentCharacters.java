package com.corejava.Programs;

public class ReplaceDuplicateAdjacentCharacters {
	
	public static void main(String[] args) {
	    String s = "azxxzccy";
	  //  s = "geeksforgeeg";
	    System.out.println(remove(s));
	}

	
	
	static String remove(String s) {
	    char res[] = new char[s.length()];
	   
	    int j = 0;
	    
	    res[j] = s.charAt(0);
	    
	    for (int i = 1; i < s.length(); i++) {
	        if (s.charAt(i) != res[j]) {
	            res[++j] = s.charAt(i);
	        } else {
	            res[j--] = '\u0000';
	        }
	    }
	    
	    String result = String.valueOf(res);
	    
	    return result.substring(0,j+1);
	}
	

}
