package com.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		int height;
		Scanner s;
		
		s=new Scanner(System.in);
		System.out.println("Please enter your height");
	    height=s.nextInt();
	    
	    if(height<60) {
	    	System.out.println("You are short");
	    }else if(height>=60 && height<=72) {
	    	System.out.println("You are medium");
	    }else if(height>72) {
	    	System.out.println("You are tall");
	    }
	    
	    
		
		

	}

}
