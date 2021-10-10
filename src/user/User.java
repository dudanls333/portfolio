package user;

public class User {
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
	public String getUserID() {
		System.out.println("User클래스의 getUserID()실행");
		return userID;
	}
	public void setUserID(String userID) {
		System.out.println("User클래스의 setUserID()실행");
		this.userID = userID;
	}
	public String getUserPassword() {
		System.out.println("User클래스의 getUserPassword()실행");
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		System.out.println("User클래스의 setUserPassword()실행");
		this.userPassword = userPassword;
	}
	public String getUserName() {
		System.out.println("User클래스의 getUserName()실행");
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("User클래스의 setUserName()실행");
		this.userName = userName;
	}
	public String getUserGender() {
		System.out.println("User클래스의 getUserGender()실행");
		return userGender;
	}
	public void setUserGender(String userGender) {
		System.out.println("User클래스의 setUserGender()실행");
		this.userGender = userGender;
	}
	public String getUserEmail() {
		System.out.println("User클래스의 getUserEmail()실행");
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		System.out.println("User클래스의 setUserEmail()실행");
		this.userEmail = userEmail;
	}
}
