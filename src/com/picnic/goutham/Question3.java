package com.picnic.goutham;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question3 {

	public static void main(String args[]) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader(".\\input.txt"));
		String line = in.readLine();
		int n=0;
		
		
		while(line != null)
		{
			if(n%2 ==0) {
				  System.out.println(line);
			}
			n++;
		  line = in.readLine();
		  
		}
		in.close();
	}
}
/*
File Input Contains
1
2
3
4
5
6
7
8
9
10
/* Output
1
3
5
7
9
*/