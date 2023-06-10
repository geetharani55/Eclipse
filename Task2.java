package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2
{
	public static void main(String[] args)
	{
		int n;
	  ArrayList<String> names=new ArrayList<>();
	  System.out.println("ent the size for list1");
		Scanner x = new Scanner(System.in);
		n = x.nextInt();
		
		System.out.println("enter " + n + " Strings  to list1");
		for (int i = 0; i < n; i++)
		{
			String str= x.next();
            names.add(str);
		}
	System.out.println("choose any one option for sorting the Strings  \n 1.BY CHARACTER \n 2.BY WORD/STRING");
	 int m=x.nextInt();
     if(m==1)
      {
    	/* System.out.println("Unsorted ArrayList: " + list1);
    	 Collections.sort(list1); // sort method for ascending order  
         System.out.println("Sorted ArrayList "+ "in Ascending order : "+ list1);*/
    	 sortStringsByCharacter(names);

     
    	}
     else
     {
    	
     }

		
    }

	private static void sortStringsByCharacter(ArrayList<String> list)
	{
		 for (int i = 0; i < ((CharSequence) list).length(); i++) 
		 {
	            char[] characters = namem[i].toCharArray();
	            Arrays.sort(characters);
	            list[i] = new String(characters);
	            System.out.println([i]);

		
	 }
}
