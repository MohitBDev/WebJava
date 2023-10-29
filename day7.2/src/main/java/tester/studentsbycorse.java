package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.studentDaoImpl;
import pojos.Course;

public class studentsbycorse {

	public static void main(String[] args) {
		studentDaoImpl dao =new studentDaoImpl();
		try(SessionFactory sf=getFactory();
				Scanner sc=new Scanner(System.in)
				){
			System.out.println("Enter Course");
			dao.allStudentsbycourse(Course.valueOf(sc.next().toUpperCase())).forEach(System.out::println);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
