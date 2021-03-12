package com.class02;

public class StringExample {

	public static void main(String[] args) {
		
		String name;
		name="Chris";

		String greeting="Good Morning!";
		String phoneNumber="123-456-6778";
		
		String space=" ";
		
		String letter="A";
		char oneLetter='A';
		
		//Hello, my name is Chris
		
		System.out.println("Hello, my name is "+name);
		
		System.out.println("How are you "+name+"?");
		
		int age=25;
		System.out.println("Im "+age);
		
		char grade='A';
		System.out.println(name+" is "+grade+" student");
		
		String car="Tesla";
		int year=2021;
		
		System.out.println("I drive "+year+" "+car);
		
		String computer="Macbook";
		int memory=250;
		
		System.out.println(name+" has "+computer+" with "+memory+" GB memory");
		
		//anything you attach to a string becomes a string
		String combinedValue=year+" "+car;
		System.out.println(combinedValue);
		
		byte day=7;
		String month="February ";
		
		String date=month+day;
		System.out.println(date);
		
	}

}
