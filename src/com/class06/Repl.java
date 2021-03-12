package com.class06;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		    System.out.println("Please enter two strings");
		    String a=s.next();
		    String b=s.next();
		    System.out.println("Please enter two numbers");
		    int c=s.nextInt();
		    int d=s.nextInt();
		    String output;

		    if(c==d && a.equals(b)){
		      output="AND";
		    }else if(c==d || a.equals(b)){
		      output="OR";
		    }else if(c!=d && !a.equals(b)) {
		    	
		    }

	}

}
