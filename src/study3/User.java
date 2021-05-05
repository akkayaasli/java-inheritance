package study3;

public class User {
	int id;
	String userNumber;
	
	
	public User(int id, String userNumber) {
		super();
		this.id = id;
		this.userNumber = userNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
}
