package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.studentDaoImpl;

public class StudentLogin {

	public static void main(String[] args) {
		try(SessionFactory sf = getFactory();
				Scanner sc=new Scanner(System.in)){
			studentDaoImpl dao =new studentDaoImpl();
			System.out.println("Enter Email and password to login ");
			System.out.println(dao.studentLogin(sc.next(), sc.next()));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	

	}
		
		
	}


