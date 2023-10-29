package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;
import org.hibernate.*;

import org.hibernate.SessionFactory;

import dao.studentDaoImpl;
import pojos.Course;
import pojos.Student;
import static java.time.LocalDate.parse;


public class AddStudentDetails {

	public static void main(String[] args) {
	
		try(SessionFactory sf=getFactory();
				Scanner sc =new Scanner(System.in);){
			studentDaoImpl sdao= new studentDaoImpl();
			System.out.println("firstName,lastName, email, password,  course,  dob");
			Student student=new Student(sc.next(), sc.next(), sc.next(), sc.next(), Course.valueOf(sc.next().toUpperCase()),parse(sc.next()));
			System.out.println(sdao.addStudents(student));
			
			
		}
	}

}
