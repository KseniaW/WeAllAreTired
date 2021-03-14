package com.class13;

public class Main {

	public static void main(String[] args) {
		SimpleClass class1 = new SimpleClass();
		class1.method2("Azi");
		class1.method1();
		
		String var1=class1.returnTheValueOfvar1();
		System.out.println(var1);
	}

}
