package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.studentDaoImpl;
import pojos.Course;

public class updatestudentcorse {

	public static void main(String[] args) {
		studentDaoImpl dao= new 	studentDaoImpl();
	
		try(SessionFactory sf=getFactory();
				Scanner sc=new Scanner(System.in);) {	
			System.out.println("Enter StudentId and updated Course");
System.out.println(dao.updatestudentcourse(sc.nextInt(),Course.valueOf(sc.next().toUpperCase())));
				
			
			
			
		}

	}

}
