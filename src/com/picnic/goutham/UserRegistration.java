package com.picnic.goutham;

public class UserRegistration extends User {

	private int mobileNumber;
	
	
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setPassword(String password,String role) {
		if("ADMIN".equals(role)) {
			this.password = password;
			System.out.println("Password Reset Successful");
		}else {
			System.out.println("you are not authorised to set the password");
		}
		
	}



	public int getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public UserRegistration(String email, String password, int mobileNumber) {
		System.out.println("Inherited Class UserRegistration");
		System.out.println("Called parameterized constructor");
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
