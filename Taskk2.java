package task;

import java.util.Arrays;
import java.util.Scanner;

public class Taskk2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of the strings:");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " strings:");

		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			strings[i] = sc.next();
		}
		System.out.println("Sort");
		System.out.println("choose any one option  \n 1.BY CHARACTER \n 2.BY WORD/STRING");

		int option = sc.nextInt();

		if (option == 1) {
			sortStringsByCharacter(strings);
		} else if (option == 2) {
			sortStringsByString(strings);
		} else {
			System.out.println("You have choosen wrong choice for sorting");
			sortStringsByCharacter(strings);
		}
	}

	public static void sortStringsByCharacter(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			char[] characters = strings[i].toCharArray();
			Arrays.sort(characters);
			strings[i] = new String(characters);
			System.out.println(strings[i]);
			// printASCIIValues(string);
		}
		System.out.println("key and values for the strings ");
		for (int i = 0; i < strings.length; i++) {
			int sum = 0;
			for (int j = 0; j < strings[i].length(); j++) {
				sum = sum + strings[i].charAt(j);
			}
			System.out.println(strings[i] + "    : " + sum);
		}

	}

	public static void sortStringsByString(String[] strings) {
		Arrays.sort(strings);

		System.out.println("Sorted strings by word/string:");
		for (String string : strings) {
			System.out.println(string);
			// printASCIIValues(string);

		}
		System.out.println("key and values for the strings ");
		for (int i = 0; i < strings.length; i++) {
			int sum = 0;
			for (int j = 0; j < strings[i].length(); j++) {
				sum = sum + strings[i].charAt(j);
			}
			System.out.println(strings[i] + "    : " + sum);
		}
	}

}
