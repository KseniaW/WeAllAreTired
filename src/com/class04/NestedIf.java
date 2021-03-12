package com.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean morning = true;
		boolean classToday = true;

		// is it morning?-->Good morning
		// if there is a class-->yes:hello classmates
		// otherwise:hello family

		if (morning) {
			System.out.println("Let me check if i have a class today");
			if (classToday) {
				System.out.println("hello classmates");
			} else {
				System.out.println("hello family");
			}
		} else {
			System.out.println("Good evening");
		}

		System.out.println("---------------------------------------------");

		boolean anyAllergy = true;
		
		String allergy="milk";
		
		if(anyAllergy) {
			System.out.println("What allergy do you have");
			if(allergy=="pollen") {
				System.out.println("Do not get close to trees");
				}else {
					System.out.println("You dont have pollen allergy");
				}
		}else {
			System.out.println("You are lucky not having allergies");
		}
		System.out.println("-------------------------------------------");

		boolean isFriday=true;
		int day=14;
		
		if(isFriday) {
			System.out.println("Go to the movie");
			if(day==13) {
				System.out.println("Watch scary movie");
			}else {
				System.out.println("Watch any movie you like");
			}
		}else {
			System.out.println("Stay home and study");
		}
		
	}

}
