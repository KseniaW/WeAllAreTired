package com.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double num1, num2, result;
		char operator;

		System.out.println("Please enter 2 numbers");
		num1 = s.nextDouble();
		num2=s.nextDouble();
		System.out.println("Choose the arithmetic operator: +,-,*,/");
		operator=s.next().charAt(0);
		
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
			default:
				result=0;
				System.out.println("Wrong operator");

		}
		if(result!=0) {
		System.out.println("The result is " + result);
	}

}
}
