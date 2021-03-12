package com.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		char grade;
		String gradeExp;

		System.out.println("Please enter your grade");
		grade = s.next().charAt(0);

		switch (grade) {
		case 'A':
			gradeExp = "Excellent";
			break;
		case 'B':
			gradeExp = "Good";
			break;
		case 'C':
			gradeExp = "Average";
			break;
		case 'D':
			gradeExp = "Bad";
			break;
		default:
			gradeExp="Not Acceptable";
			break;

		}
		System.out.println("If you got grade "+grade+", your result is considered to be "+gradeExp);

	}

}
