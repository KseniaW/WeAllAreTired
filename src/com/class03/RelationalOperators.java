package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		//>, <, >=, <=, ==, != (relational operators)
		
		int a=10;
		int b=7;
		
		System.out.println(a>b);
		System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        //result is always a boolean
 System.out.println("----------------------------------------------");       
        
 boolean result=a>=b;
        boolean result1=a<=b;
        System.out.println(result);
        System.out.println(result1);
        
        int c=20;
        int d=29;
        
        System.out.println(c==d);// comparing, checking if equal
        System.out.println(c=d);//reassigning
        System.out.println(c);
	}

}
