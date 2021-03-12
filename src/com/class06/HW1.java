package com.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String country,language;
		
		System.out.println("Please enter your country");
		country=s.nextLine();
		
		switch(country) {
		case "Russia":
			language="Russian";
			break;
		case "USA":
			language="English";
			break;
		case "Mexico":
			language="Spanish";
			break;
		case "Turkey":
			language="Turkish";
			break;
		case "China":
			language="Chinese";
			break;
			default:
				language="Unknown";
		}
		
		System.out.println("If your country is "+country+", your language is "+language);

	}

}
