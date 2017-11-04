import java.util.ArrayList;

/*
*               Course                *
*-------------------------------------*
* -courseName: String                 *
* -students: ArrayList<String>        *
* -numberOfStudents: int              *
* +Course(courseName: String)         *
* +getCourseName(): String            *
* +addStudent(student: String): void  *
* +dropStudent(student: String): void *
* +getStudents(): String[]            *
* +getNumberOfStudents(): int         *
*/
public class Course {
	
	private String courseName;
	private ArrayList<String> students; 
	
	// Add a course
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}
	
	public void addStudent(String student) {
		students.add(student);
	}
	
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}
	
	public int getNumberOfStudents() {
		return students.size();
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		students.remove(student);
	}

}
