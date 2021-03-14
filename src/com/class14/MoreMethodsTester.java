package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		MoreMethodExamples m = new MoreMethodExamples();

		System.out.println(m.print());
		System.out.println(m.doubleTheValue(2.4));
		m.bool(true);
		m.pr();
		System.out.println(m.greater(12, 10));
		
		int[] s= {10, 20,30};
		System.out.println(m.sumArray(s));
		
		
		System.out.println(m.check("aba"));
		System.out.println(m.check("gdshfrd"));
		
	}

}
