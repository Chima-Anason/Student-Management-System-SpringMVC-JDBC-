package com.seleniumexpress.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.sm.DAO.StudentDAO;
import com.seleniumexpress.sm.api.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> loadStudents() {
		
		//call the DAO method to get the data
		List<Student> studentList = studentDAO.loadStudents();
		
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		
		studentDAO.saveStudent(student);

	}

	@Override
	public Student getStudentById(int id) {
		
		Student student = studentDAO.getStudentById(id);
		
		return student;
	}

	@Override
	public void update(Student student) {
		
		studentDAO.update(student);
		
	}

}
