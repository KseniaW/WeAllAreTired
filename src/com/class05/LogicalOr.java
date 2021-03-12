package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/*
		 * variable day
		 * 
		 * if day is Tuesday and Wednesday-->Manual Class if day is Monday or
		 * Friday-->no class if day is Suturday or Sunday-->Java class if day is
		 * Thursday-->review class
		 * 
		 * False || False-->False
		 * False || True-->True
		 */
		String day = "Monday";

		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today i have no class");
		}else if(day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today i have manual class");
		}else if(day.equals("Thursday")) {
			System.out.println("Today i have review class");
		}else if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today i have Java class");
		}else {
			System.out.println("Invalid day");
		}
	}

}
