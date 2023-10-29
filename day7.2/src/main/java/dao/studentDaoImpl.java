package dao;

import static utils.HibernateUtils.getFactory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Course;
import pojos.Student;

public class studentDaoImpl implements studentDao {

	@Override
	public String addStudents(Student stud) {
		String mesg ="add  student details failed";
		Session session = getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			Integer id=(Integer)session.save(stud);
			 mesg ="add  student details "
			 		+ "succed Id :" +id;
			tx.commit();
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
			
		}
		
		
		
		return mesg;
	}

	@Override
	public List<Student> getStudentDetails() {
		String jpql="select s from Student s";
		List<Student> studs=null;
		Session session = getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			studs=session.createQuery(jpql,Student.class).getResultList();
			
			
			tx.commit();
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
			
		}
		
		
		
		return studs ;
	}

	@Override
	public String studentLogin(String em, String pass) {
		String mesg ="invalid  student  login details !!!";
		String jpql="Select s from Student s where email=:em and password=:pas";
		Session session = getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			Student stud=(Student)session.createQuery(jpql,Student.class).setParameter("em", em).
					setParameter("pas", pass).getSingleResult();
			 mesg = "  student Logged in "+stud.getFirstName()+stud.getLastName();
			tx.commit();
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
			
		}
		
		
		
		return mesg;
	}

	@Override
	public List<Student> allStudentsbycourse(Course cours) {
		List<Student> stu=null;
		Session session =getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		String jpql="select s from Student s where course=:cor ";
		
		
		try {
			stu=session.createQuery(jpql,Student.class).setParameter("cor", cours).getResultList();
			tx.commit();
			
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
			
			
		}
		return stu;
	}

	@Override
	public String updatestudentcourse(int id, Course cors) {
		String msg="update course Failed";
		Student stud=null;
		String jpql="select s from Student s where StudentId=:iid  ";
		Session session =getFactory().getCurrentSession();
		Transaction tx =session.beginTransaction();
		try {
			stud=session.createQuery(jpql,Student.class).setParameter("iid", id).getSingleResult();
			stud.setCourse(cors);
			tx.commit();
			msg="Updated Sucessful"+stud;
			
		}
		catch(RuntimeException e) { 
			if(tx!=null)
				tx.rollback();
			
		}
		
		return msg;
	}
	
	
	
	
	
	
	

}
