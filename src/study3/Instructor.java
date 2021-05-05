package study3;

public class Instructor extends User{
	String instructorCode;

	public Instructor(int id, String userNumber, String instructorCode) {
		super(id, userNumber);
		this.instructorCode = instructorCode;
	}

	public String getInstructorCode() {
		return instructorCode;
	}

	public void setInstructorCode(String instructorCode) {
		this.instructorCode = instructorCode;
	}
	
}
