package com.class04;

import java.util.Scanner;

//ctrl+shift+o
public class Demo {

	public static void main(String[] args) {

		//nextLine captures a text(entire line) with spaces
		//next captures one word(without spaces)

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some text");
		String str1 = scan.nextLine();
		System.out.println("Text that i entered is "+str1);
		
		System.out.println("Enter the number");
		int num1=scan.nextInt();
		if(num1>1) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
	}

}
