package com.class05;

import java.util.Scanner;

public class ExtraTask {

	public static void main(String[] args) {

		int quiz, midTerm, finalScore;
		char grade = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter your quiz score");
		quiz = s.nextInt();
		System.out.println("Enter your midterm score");
		midTerm = s.nextInt();
		System.out.println("enter your final score");
		finalScore = s.nextInt();

		double average = (quiz + midTerm + finalScore) / 3;

		if (average >= 90) {
			grade = 'A';
		} else if (average >= 70 && average < 90) {
			grade = 'B';
		} else if (average >= 50 && average < 70) {
			grade = 'C';
		} else if (average < 50) {
			grade = 'F';
		} else {
			System.out.println("Invalid score");
		}
		System.out.println("Based on your average score you have a grade " + grade);
	}

}
