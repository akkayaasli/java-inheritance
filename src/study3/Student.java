package study3;

public class Student extends User{
	String studentCode;


	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Student(int id, String userNumber, String studentCode) {
		super(id, userNumber);
		this.studentCode = studentCode;
	}
}
