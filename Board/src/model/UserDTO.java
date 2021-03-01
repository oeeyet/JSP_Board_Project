package model;

public class UserDTO {

	int userID;
	String userName;
	String userPassword;
	String userPasswordHash;
	
	
	public int getUserID() {
		return userID;
	}
	public UserDTO setUserID(int userID) {
		this.userID = userID;
		return this;
	}
	public String getUserName() {
		return userName;
	}
	public UserDTO setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public UserDTO setUserPassword(String userPassword) {
		this.userPassword = userPassword;
		return this;
	}
	public String getUserPasswordHash() {
		return userPasswordHash;
	}
	public UserDTO setUserPasswordHash(String userPasswordHash) {
		this.userPasswordHash = userPasswordHash;
		return this;
	}
	
	
}
