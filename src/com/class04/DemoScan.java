package com.class04;

import java.util.Scanner;

public class DemoScan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter another number");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if(num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println("Numbers are equal");
		}

	}

}
