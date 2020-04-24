package com.picnic.goutham;

public class Question2 {

	public static void main(String args[]) {
		int n = 9;

		int temp1 = 0;
		int temp2 = 1;
		int temp3 = 0;
		String output = "" + temp1 + " " + temp2;

		for (int j = 2; j <= n; j++) {
			temp3 = temp1 + temp2;
			output = output + " " + temp3;
			temp1 = temp2;
			temp2 = temp3;
		}
		System.out.println("Fibonacci series for "+ n+ " digitis as follows");
		System.out.println(output);
	}
}

/* Output
Fibonacci series for 9 digitis as follows
0 1 1 2 3 5 8 13 21 34
*/