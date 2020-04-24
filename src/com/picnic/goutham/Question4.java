package com.picnic.goutham;

public class Question4 {

	public static void main(String args[]) {
		UserRegistration user1 = new UserRegistration("gk11@gmail.com", "qwerty", 91123245);
		System.out.println(user1.getEmail() + " "+ user1+" "+ user1.getMobileNumber());
		
	}
}
/* Output
Inherited Class UserRegistration
Called parameterized constructor
gk11@gmail.com com.picnic.goutham.UserRegistration@15db9742 91123245
*/

