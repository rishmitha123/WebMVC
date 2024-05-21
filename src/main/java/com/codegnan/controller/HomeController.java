package com.codegnan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.codegnan.entity.Employee;
import com.codegnan.service.EmployeeService;

@Controller
public class HomeController {
	
	EmployeeService employeeService;
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/hello/{na}")
	public ModelAndView hello(@PathVariable("na") String name) {
		ModelAndView modelAndView = new ModelAndView("hello");
//		String name = "rishmi";
		modelAndView.addObject("n", name);
		return modelAndView;
	}
	@RequestMapping("/form")
	public ModelAndView showForm() {
		ModelAndView modelAndView = new ModelAndView("form");
		Employee employee = new Employee();
		modelAndView.addObject("emp", employee);
		return modelAndView;
	}
	@RequestMapping("register")
	public ModelAndView registerEmployee(@ModelAttribute("emp") Employee employee) {
		System.out.println("Saved : "+  employeeService.saveEmployee(employee));
		ModelAndView modelAndView = new ModelAndView("showEmployee");
		modelAndView.addObject("emp", employee);
		return modelAndView;
	}
}
