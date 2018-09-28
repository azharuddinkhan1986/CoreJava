package com.corejava.Programs;

public class FindDuplicateElementInArray {
	
	
	
	public static void main(String[] args) {
		String array[]={"azhar","azhar","meraj","himanshu","himanshu"};
		FindDuplicateElementInArray obj=new FindDuplicateElementInArray();
		obj.getDuplicateElement(array);
	}
	
	public void getDuplicateElement(String [] arrayElement)
	{
		 if(arrayElement==null)
		 {
			System.out.println("null");
		 }
		 
		 for(int i=0;i<arrayElement.length-1;i++)
		 {
			 for(int j=i+1;j<arrayElement.length;j++)
			 {
				 if((arrayElement[i].equals(arrayElement[j]))& i!=j)
                 {
                    System.out.println(arrayElement[i]);
                 }
			 }
			 
		 }
		
	}

}
