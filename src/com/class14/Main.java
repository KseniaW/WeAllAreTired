package com.class14;

public class Main {
	
	  int sumEvenToX(int x){
		    int sumEven=0;
		    for(int i=1; i<=x;i++ ){
		      if(i%2==0){
		        sumEven+=i;
		      }
		    }return sumEven;
		  }
		  public static void main(String[] args){
		    Main m=new Main();
		   System.out.println( m.sumEvenToX(5));
		  }
		}

