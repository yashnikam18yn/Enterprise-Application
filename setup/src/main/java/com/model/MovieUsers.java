package com.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieUsers {
	private int userId;
	
	
	@NotBlank(message = "Username is required")
	private String userName;
	
	@NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
	private String userEmail;
	
	 @NotBlank(message = "Password is required")
	 @Size(min = 6, message = "Password must be at least 6 characters long")
	private String userPassword;
	
	
	public MovieUsers(){
		
	}


	public MovieUsers(int userId, String userName, String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	@Override
	public String toString() {
		return "MovieUsers [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userPassword=" + userPassword + "]";
	}
	
	
	
}
