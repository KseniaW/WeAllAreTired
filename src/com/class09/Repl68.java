package com.class09;

public class Repl68 {

	public static void main(String[] args) {
		
		for(int r=1; r<=4; r++){
		for(int c=1; c<=4; c++) {
			if(r==1 || c==1 || c==4||r==4) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
		}
		System.out.println();
		}

	}

}
