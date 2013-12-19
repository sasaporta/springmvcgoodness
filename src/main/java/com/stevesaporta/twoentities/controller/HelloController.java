package com.stevesaporta.twoentities.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stevesaporta.twoentities.entity.Wrapper;
 
@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String redirect() {
		return "redirect:/test";
	}
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String displayForm(Wrapper wrapper) {
		//Student student = new Student();
		//student.setName("foo");
		//Employee employee = new Employee();
		//wrapper.setStudent(student);
		//wrapper.setEmployee(employee);
		return "test";
	}
	
	@RequestMapping(value="/test", method = RequestMethod.POST)
	public String formSubmitted(Wrapper wrapper) {
		return "thankyou";
	}
 
}