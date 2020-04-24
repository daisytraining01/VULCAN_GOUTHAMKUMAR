package com.picnic.goutham;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		String str= "aba";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		str = sc.next();
		sc.close();
		String rev = "";
		int length = str.length();
		 
	      for ( int i = length - 1; i >= 0; i-- ) {
	    	  rev = rev + str.charAt(i);
	      }
	        
	 
	      if (str.equals(rev)) {
	    	  System.out.println(str+" is a palindrome");
	      }else {
	    	  System.out.println(str+" is not a palindrome");
	      }
	       
	         
	 
	   
	}
}

/* Output

ABA
ABA is a palindrome
*/