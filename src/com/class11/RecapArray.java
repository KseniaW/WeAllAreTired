package com.class11;

import java.util.Scanner;

public class RecapArray {

	public static void main(String[] args) {

		/*
		 * array that will store elements from a user
		 */

		Scanner s = new Scanner(System.in);
		String element=null;
		System.out.println("How many elements would you like to store?");
		int size = s.nextInt();
		String[] array = new String[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter an element");
			array[i]=s.next();
}
		for(String b:array) {
			System.out.print(b+" ");
		}

	}

}
