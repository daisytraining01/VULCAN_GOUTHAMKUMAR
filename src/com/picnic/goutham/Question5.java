package com.picnic.goutham;

public class Question5 {

	public static void main(String[] args) {
		//Replace the String
		String STR = "REST ASSURED";
		System.out.println("Given String "+STR);
		String ReplaceString = STR.replace("ST", "");
		
		System.out.println(ReplaceString);
		
		//Compare Two Strings
		if(ReplaceString.contentEquals(STR)) {
			System.out.println("Given Strings "+STR+"  " + ReplaceString + " are matched");
		}else {
			System.out.println("Given Strings "+STR+"  " + ReplaceString + " are not matched");
		}
		
		
	}

}
/*Output
Given String REST ASSURED
RE ASSURED
Given Strings REST ASSURED  RE ASSURED are not matched
*/
