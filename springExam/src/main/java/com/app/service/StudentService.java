package com.app.service;

import java.util.List;

import com.app.dto.CourseDto;
import com.app.dto.StudentDto;
import com.app.entities.Student;

public interface StudentService {
	List<Student> getall();
	String addstud(StudentDto s);
	String deletestud(Long id);
	String updatestud(StudentDto s);
	Student getstud(Long id);
	String addcourse(CourseDto c);
	List<Student> getallstudbycourse(Long id);
	

      
	
	
	
	

}
