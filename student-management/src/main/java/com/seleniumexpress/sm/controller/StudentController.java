package com.seleniumexpress.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seleniumexpress.sm.DAO.StudentDAO;
import com.seleniumexpress.sm.api.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	
	@GetMapping("/showStudent")
	private String showStudentList(Model model) {
		
		//call the DAO method to get the data
		List<Student> studentList = studentDAO.loadStudents();
		
		for(Student tempStudent : studentList) {
			
			System.out.println(tempStudent);
		}
		
		
		model.addAttribute("students", studentList);
		
		return "student-list";

	}
	
	
	
	@GetMapping("/showAddStudent")
	private String addStudent(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "add-student";

	}
	
	
	@ResponseBody
	@GetMapping("/save-student")
	private String saveStudent(Student student) {
		
		System.out.println(student);
		
		//do a DAO call to save the student
		studentDAO.saveStudent(student);
		
		return "student saved ....";

	}

}
