package tester;

import static utils.HibernateUtils.getFactory;

import java.util.ArrayList;

import org.hibernate.SessionFactory;

import dao.studentDaoImpl;
import pojos.Student;

public class getStudentDetails {

	public static void main(String[] args) {
		
		try(SessionFactory sf = getFactory()){
			studentDaoImpl dao =new studentDaoImpl();
			ArrayList<Student> students=(ArrayList<Student>) dao.getStudentDetails();
			students.forEach(System.out::println);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	

	}

}
