package study3;

public class StudentManager {
	public void addNewCourse(studentCourse newCourse) {
		System.out.println(newCourse.getCourseName() + " kursunu listenize eklediniz.");//sepete eklenen ürünü oku
	}
	
	public void addMultipleCourse(studentCourse[] newCourse) {		
	
		for(studentCourse courses : newCourse) {
			addNewCourse(courses);
			
		}
	}
	public void courseUpdate(studentCourse updateCourse) {
		System.out.println(updateCourse.getCourseName() + " kursunu güncellediniz."  );//sepete eklenen ürünü oku
	}
	
	public void multipleCourseUpdate(studentCourse[] UpdateCourse) {		

		for(studentCourse coursesUpdate : UpdateCourse) {
			courseUpdate(coursesUpdate);
			
		}
	}
	
	public void courseDelete(studentCourse deleteCourse) {
		System.out.println(deleteCourse.getCourseName() + " kursunu sildiniz."  );
	}
	
	public void multipleCourseDelete(studentCourse[] DeleteCourse) {		

		for(studentCourse coursesDelete : DeleteCourse) {
			courseDelete(coursesDelete);
			
		}
	}
}
