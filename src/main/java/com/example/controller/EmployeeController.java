package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/emp")
	public String getHomePage() {
		System.out.println("from above html page :");
		return "home.jsp";
	}
// >>>>>>>>>>>>>>>>>>>>>>>>>>> Example for Spring MVC <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	/*
	 * @PostMapping("/addEmployee") public String addEmployee(@RequestParam String
	 * firstName, @RequestParam String lastName, @RequestParam String email, Model
	 * model) { model.addAttribute("firstName", firstName);
	 * model.addAttribute("lastName", lastName); model.addAttribute("email", email);
	 * System.out.println("Details submitted Successfully");
	 * 
	 * System.out.println( "Employee FirstName : " + firstName +
	 * " ,Employee LastName : " + lastName + " ,Email : " + email); return
	 * "sucess.jsp"; }
	 */

	@PostMapping("/addEmployee")
	public String createEmployee(Employee employee, Model model) {
		employeeRepository.save(employee);
		return "sucess.jsp";

	}

}
