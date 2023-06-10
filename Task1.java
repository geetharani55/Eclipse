package task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Task1 
{
	public static void main(String[] args)
	{
		int n, n1;
		// LinkedList<Integer> list1=new LinkedList<Integer>();
		List<Integer> list1 = new ArrayList<>();
		System.out.println("ent no.of ele to list1");
		Scanner x = new Scanner(System.in);
		n = x.nextInt();

//list2		
		// LinkedList<Integer> list2=new LinkedList<Integer>();
		List<Integer> list2 = new ArrayList<>();
		System.out.println("ent no.of ele to list2");
		Scanner xx = new Scanner(System.in);
		n1 = xx.nextInt();

//insert elements to list1 and list2		
		System.out.println("enter " + n + " ele to list1");
		for (int i = 0; i < n; i++)
		{
			Integer list1_ele = x.nextInt();
			list1.add(list1_ele);
		}

		// System.out.println("list1:"+list1);
		removeDuplicates(list1);

		System.out.println("enter " + n1 + " ele to list2");
		for (int i = 0; i < n1; i++) {
			Integer list2_ele = xx.nextInt();
			list2.add(list2_ele);
		}
		// System.out.println("list2:"+list2);

		/*
		 * list1.retainAll(list2);
		 * System.out.println("The common elements from the two lists are: " +list1);
		 */

		// Print the common elements
		List<Integer> commonElements = new ArrayList<>();
		for (Integer com_ele : list1) {
			// Check if the element exists in list2
			if (list2.contains(com_ele)) {
				commonElements.add(com_ele);
			}
		}
		System.out.println("Common elements from two lists: " + commonElements);

		System.out.println("palindromes ele from common elements:");
		for (Integer element : commonElements) {
			if (isPalindrome(element)) {
				System.out.println(element);
			}
		}
	}// main

	public static void removeDuplicates(List<Integer> list) {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			int current = list.get(i);
			for (int j = i + 1; j < size; j++) {
				if (list.get(j).equals(current)) {
					list.remove(j);
					size--;
					j--;
				}
			}
		}
	}

	private static boolean isPalindrome(Integer element) {
		String str = String.valueOf(element);
		int a = 0, b = str.length() - 1;
		while (a < b) {
			if (str.charAt(a) != str.charAt(b)) {
				return false;
			}
			a++;
			b--;
		}
		return true;
	
			}
				
	
	}		

		
	


