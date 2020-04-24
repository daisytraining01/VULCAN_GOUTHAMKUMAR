package com.picnic.goutham;

public class Question8 implements Calculator {

	public static void main(String[] args) {
		Question8 obj = new Question8();
		System.out.println("Addition of 1,2 is "+obj.add(1, 2) );
		System.out.println("Addition of 1,2,3 is "+obj.add(1, 2,3) );

	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int add(int a, int b, int c) {
		System.out.println("Add Method overloaded");
		return a+b+c;
	}

}

/* Output
Addition of 1,2 is 3
Add Method overloaded
Addition of 1,2,3 is 6
*/
