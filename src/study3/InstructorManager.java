package study3;

public class InstructorManager {
	public void add(Student newStudent) {
		System.out.println(newStudent.studentCode+" numaral� ��renci kaydedildi.");
	}

	public void addMultiple(Student[] students) {
		
		
		for(Student student : students) {
			add(student);
			
		}
	}

}
