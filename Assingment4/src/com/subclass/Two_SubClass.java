package com.subclass;

import com.assignment4.Question_Two;

public class Two_SubClass extends Question_Two{

	public static void main(String[] args) {
		
	Two_SubClass sb = new Two_SubClass();
	sb.substract(10, 5);
	sb.multiply(10, 5);
	sb.divide(10, 5);
	sb.factorial(4);
	sb.reverse("1234");

	}
	
	@Override
	public void substract(int x, int y) {
		
	     System.out.println("After subtraction, the number is " + (x-y));
	}
	
            @Override
	public void multiply(int x, int y) {
		
	     System.out.println("After multiplication, the number is " + (x*y));
	}
		
	
	@Override
	public void divide(int x, int y) {
		
	     System.out.println("After division, the number is " + (x/y));
		
	}
	
	@Override
	public void factorial(int x) {
		int y =1;
		for(int i =1; i<=x; i++) {
			y = y*i;
			
		}
		System.out.println("The factorial of " + x + " is " + y);
	}
		

	@Override
	public void reverse(String x) {
		System.out.println("Number before reverse is " + x);
		String reverseNum = "";
		for(int i = x.length()-1; i>=0; i--) {
			reverseNum = reverseNum + x.charAt(i);
		}
		System.out.println("Number after reverse is " + reverseNum);
		
	}


}
