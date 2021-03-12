package com.class05;

import java.util.Scanner;

public class HW2SecondWay {

	public static void main(String[] args) {
		double num1, num2, num3, largest;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		num1 = s.nextDouble();
		num2 = s.nextDouble();
		num3 = s.nextDouble();

		if (num1 > num2) {
			if (num1 > num3) {
				largest = num1;
			} else {
				largest = num3;
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				largest = num2;
			} else {
				largest = num3;
			}
		} else {
			largest = num2;
		}

		System.out.println("The largest number is " + largest);
	}

}
