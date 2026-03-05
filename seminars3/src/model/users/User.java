package model.users;

public class User extends GuestUser {
	private String nameAndSurname;
	private String username;
	private String password;
	
	public User(){}
	public User(String a, String b, String c) {
		nameAndSurname = a;
		username = b;
		password = c;
	}
	
	public String getNameAndSurname() {
		return nameAndSurname;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean login(String name, String user, String key) {
		if (this.username == user && this.password == key) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	public String followPage() {
		
	}
	*/
	
	@Override
	public String toString() {
		return "User [nameAndSurname=" + nameAndSurname + ", username=" + username + ", password=" + password + "]";
	}
}
