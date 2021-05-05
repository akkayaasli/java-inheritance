package study3;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1=new User(1,"000369");
        UserManager userManager = new UserManager();
        userManager.add(user1);



		Student ogr1=new Student(1,"002","123");	
		
		Student ogr2=new Student(2,"003","124");
		
		
		InstructorManager instructorManager=new InstructorManager();
	
		Student[] students= {ogr1,ogr2};
		instructorManager.addMultiple(students);
		
		
		
		studentCourse studentCourse1=new studentCourse();
		studentCourse1.setCourseID(1);
		studentCourse1.setCourseName("Web Yazılım");
		
		studentCourse studentCourse2=new studentCourse();
		studentCourse2.setCourseID(2);
		studentCourse2.setCourseName("IOS Yazılım");
		
		studentCourse studentCourse3=new studentCourse();
		studentCourse3.setCourseID(3);
		studentCourse3.setCourseName("Kotlin Yazılım");
		
		StudentManager studentManager=new StudentManager();
		
		studentCourse[] newCourse= {studentCourse1,studentCourse2};
		studentManager.addMultipleCourse(newCourse);
		
		studentCourse[] UpdateCourse= {studentCourse1};
		studentManager.multipleCourseUpdate(UpdateCourse);
		
		studentCourse[] DeleteCourse= {studentCourse1};
		studentManager.multipleCourseDelete(DeleteCourse);
		
        userManager.out(user1);
		
		

		
		
		

	}

}
