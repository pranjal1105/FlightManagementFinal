package com.capgemini.entities;

public class Users
{
	private int userId;
	private String userName;
	private String userPassword;
	private long userPhone;
	private String userEmail;
	private String userType;
	
	public Users(int userId, String userName, String userPassword, long userPhone, String userEmail, String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userType = userType;
	}
	public Users() {
		super();
	}

	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	@Override
	public String toString() {
		return "[userId=" + userId + ",\tuserName=" + userName + ",\tuserPhone=" + userPhone + ",\tuserEmail="
				+ userEmail + ",\tuserType=" + userType + "]";
	}
	
}
