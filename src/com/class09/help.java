package com.class09;

import java.util.Scanner;

public class help {

	
		public static void main(String [] args){
			   Scanner scann=new Scanner(System.in);
			   System.out.println("Please enter two strings");
			   String word1=scann.nextLine();
			   String word2=scann.nextLine();
			   System.out.println("Please enter two numbers");
			   int int1=scann.nextInt();
			  int int2=scann.nextInt();
			 
			  if(int1==int2 && word1.equals(word2)){
			System.out.println("AND");
			}else if(int1==int2 || word1.equals(word2)){
			System.out.println("OR");
			}else{
			  System.out.println("NONE");
			}
			 }
			

	}


