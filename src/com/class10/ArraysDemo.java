package com.class10;

public class ArraysDemo {

	public static void main(String[] args) {
	
		int []b= {3,5,8,-1};
		for(int num:b) {
		System.out.print(num+" ");
		}
		System.out.println();
		System.out.println(b.length);
		
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
