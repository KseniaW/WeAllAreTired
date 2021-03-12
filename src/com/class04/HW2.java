package com.class04;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=s.nextInt();
		if (age>=18) {
			System.out.println("You can be issued a driver license");
		}else {
			System.out.println("You are too young. You can only get a learner's permit at this time");
		}
		

	}
	

}
