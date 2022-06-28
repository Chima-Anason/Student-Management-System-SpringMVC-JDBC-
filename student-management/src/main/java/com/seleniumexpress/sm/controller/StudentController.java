package com.seleniumexpress.sm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/showStudent")
	private String showStudentList() {
		
		
		return "student-list";

	}

}
