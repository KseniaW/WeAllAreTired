package com.class04;

public class NestedIfExamples {

	public static void main(String[] args) {
		
		boolean completedAssignment=true;
		int score=90;
		
		if(completedAssignment) {
			System.out.println("You completed assignment");
			if(score>90) {
				System.out.println("Great job");
			}else if(score>80) {
				System.out.println("Good job");
			}else if(score>70) {
				System.out.println("Good, but try to do better");
			}else {
				System.out.println("Good for trying but study more");
			}
		}else {
			System.out.println("The assignment is incomplete");
		}
System.out.println("------------------------------------");


	}

}
