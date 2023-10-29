package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFound;
import com.app.dto.CourseDto;
import com.app.dto.StudentDto;
import com.app.entities.Course;
import com.app.entities.Student;
import com.app.repository.CourseRepo;
import com.app.repository.StudentRepo;

@Service
@Transactional

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo srepo;
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private CourseRepo crepo;

	@Override
	public List<Student> getall() {
		
		return srepo.findAll();
	}

	@Override
	public String addstud(StudentDto s) {
	 String msg ="Invalid Student";
	 Student s1=mapper.map(s, Student.class);
	    srepo.save(s1);
	    Course c=crepo.findById(s.getCourseid()).orElseThrow();
	    c.addStudent(s1);
	    msg =" Student Added";
	    
	    
		return msg ;
	}

	@Override
	public String deletestud(Long id) {
		 String msg ="Invalid Student id";
		    
	
		    srepo.deleteById(id);
		    
		    msg =" Student deleted";
		    
		    
			return msg ;
	}

	@Override
	public String updatestud(StudentDto s) {
		String msg ="Invalid Student";
		 Student s1=mapper.map(s, Student.class);
		    srepo.save(s1);
		    msg =" Student Updated";
		    
		    
			return msg ;
	}

	@Override
	public Student getstud(Long id) {
	
		return srepo.findById(id).orElseThrow(()-> new ResourceNotFound("invalid id"));
	}

	@Override
	public String addcourse(CourseDto c) {
		String msg ="Invalid Course";
		 Course c1=mapper.map(c, Course.class);
		    crepo.save(c1);
		    msg =" Course  Added";
		    
		    			return msg ;
	}

	@Override
	public List<Student> getallstudbycourse(Long id) {
		 Course c=crepo.findById(id).orElseThrow();
		 System.out.println(c);
		
		return c.getStudents();
	}
	
}
