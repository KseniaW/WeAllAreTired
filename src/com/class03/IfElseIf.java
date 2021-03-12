package com.class03;

public class IfElseIf {

	public static void main(String[] args) {
//3 possible conditions
		double a = 3.5;
		double b = 3.5;

		if (a > b) {
			System.out.println("Double value " + a + " is larger than " + b);
		} else if(a<b) {
			System.out.println("Double value " + b + " is larger than " + b);
		}else {
			System.out.println(a+" is equal to "+b);
		}
//ladder statement
		int day=0;
		if(day==1) {
			System.out.println("Today is Monday");
			
		}else if(day==2) {
			System.out.println("Today is Tuesday");
		}else if(day==3) {
			System.out.println("Today is Wednesday");
		}else if(day==4) {
			System.out.println("Today is Thursday");
		}else if(day==5) {
			System.out.println("Today is Friday");
		}else if(day==6) {
			System.out.println("Today is Saturday");
		}else if(day==7) {
			System.out.println("Today is Sunday");
		}else {
			System.out.println("The day is invalid");
		}
		
		
	}

}
