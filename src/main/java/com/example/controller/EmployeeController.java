package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	@GetMapping("/emp")
	public String getHomePage() {
		System.out.println("from above html page :");
		return "home.jsp";
	}

}
