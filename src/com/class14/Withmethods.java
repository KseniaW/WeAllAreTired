package com.class14;

public class Withmethods {
	
	public static void main(String[] args) {
		
		int num1=10;
		int num2=-1;
		int num3=0;
		int num4=0;
		checkNumbers(num1);
		checkNumbers(num2);
		checkNumbers(num3);
		checkNumbers(num4);
	}
		public static void checkNumbers(int num) {
			if(num>0) {
				System.out.println(num+" is greater than zero");
			}else if(num<0) {
				System.out.println(num+" is less than zero");
			}else {
				System.out.println(num+" is zero");
			}
		}
	
		
	}


		
	


