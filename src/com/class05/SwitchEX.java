package com.class05;

import java.util.Scanner;

public class SwitchEX {

	public static void main(String[] args) {
		int height;
		String definition;
Scanner s=new Scanner(System.in);
System.out.println("Enter your height");
height=s.nextInt();
if(height<=60) {
	definition="short";
}else if(height>60 && height <=72) {
	definition="medium";
}else {
	definition="tall";
}
System.out.println("You are person who's height is "+definition);
	}

}
