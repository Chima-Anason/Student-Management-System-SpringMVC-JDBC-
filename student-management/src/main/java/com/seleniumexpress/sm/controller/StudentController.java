package com.seleniumexpress.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
