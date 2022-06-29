package com.seleniumexpress.sm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		//do a condition check
		//if the user don't have an id then do an insert
		//if the user have an id --> do an update
		
		if(student.getId() == 0) {
			//insert a new record
			studentService.saveStudent(student);
		}else {
			//do an update
			studentService.update(student);
		}
		
		
		return "redirect:/showStudent";

	}
	
	
	
	@GetMapping("/updateStudent")
	private String updateStudent(@RequestParam("userId") int id,Model model) {
		
		//we should get the data object of a particular student
		System.out.println("finding data for the student with id : " +id);
		
		Student theStudent = studentService.getStudentById(id);
		System.out.println(theStudent);
		
		model.addAttribute("student", theStudent);
		
		return "add-student";

	}
	
	
	
	@GetMapping("/deleteStudent")
	private String deleteStudent(@RequestParam("userId") int id) {
		
		//capture the id of the student you are trying to delete
		//once captured the id, do a service call to delete the student
		
		studentService.deleteStudent(id);
		
		return "redirect:/showStudent";

	}

}
