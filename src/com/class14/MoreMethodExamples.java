package com.class14;

public class MoreMethodExamples {
	String print() {
		return "Hi";
	}

	double doubleTheValue(double input) {
		return input * 2;
	}

	void bool(boolean b) {
		if (b) {
			System.out.println("take umbrella");
		} else {
			System.out.println("go for a walk");
		}
	}

	void pr() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Batch 9");
		}
	}

	int greater(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	void num(int n) {
		if (n % 2 == 0) {
			System.out.println("number is even");
		} else if (n % 2 != 0) {
			System.out.println("number is odd");
		} else {
			System.out.println("the number is 0");
		}
	}

	int sumArray(int[]s) {
	int sum=0;
	for(int a:s) {
	return sum+=a;
	}
	return sum;
	
}
	//find out if the string is mirror to itself
	//aba yes
	//bbb yes
	//bba
	
   

   boolean check(String str) {
	String newStr="";
	
	for(int i=str.length()-1; i>=0; i--) {
		System.out.println(i+" "+str.charAt(i));
		newStr+=str.charAt(i);
	}
	System.out.println(newStr);
	if(str.equals(newStr)) {
		
	
	return true;
	}else {
		return false;
	}
}}
