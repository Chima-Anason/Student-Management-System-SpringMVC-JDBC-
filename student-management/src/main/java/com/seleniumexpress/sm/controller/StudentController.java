package com.seleniumexpress.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seleniumexpress.sm.DAO.StudentDAO;
import com.seleniumexpress.sm.api.Student;
import com.seleniumexpress.sm.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/showStudent")
	private String showStudentList(Model model) {
		
		//call the Service method to get the data
		List<Student> studentList = studentService.loadStudents();
		
		model.addAttribute("students", studentList);
		
		return "student-list";

	}
	
	
	
	@GetMapping("/showAddStudent")
	private String addStudent(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "add-student";

	}
	
	
	@PostMapping("/save-student")
	private String saveStudent(Student student) {
		
		System.out.println(student);
		
		//do a Service call to save the student
		studentService.saveStudent(student);
		
		return "redirect:/showStudent";

	}

}
