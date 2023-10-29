package dao;

import java.util.List;

import pojos.Course;
import pojos.Student;

public interface studentDao {
	String addStudents(Student stud);
	List<Student> getStudentDetails();
	String studentLogin(String em ,String pass);
	List<Student> allStudentsbycourse(Course cours);
	String  updatestudentcourse(int id,Course cors);
}
