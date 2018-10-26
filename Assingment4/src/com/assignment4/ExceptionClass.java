package com.assignment4;

public class ExceptionClass {

	public static void main(String[] args) {
		
		int [] a = {23, 25, 54, 76};
		
		try {
			System.out.println(a[8]);
		} catch (Exception e) {
			System.out.println("There is an error" + e);
		}
		
	
}
}
