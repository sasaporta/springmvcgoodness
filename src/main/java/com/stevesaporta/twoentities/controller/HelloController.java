package com.stevesaporta.twoentities.controller;
 
import java.io.IOException;

import org.omg.CORBA.portable.InputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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

	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String upload() {
		return "upload";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("myfile") MultipartFile myFile) throws IOException {
	  System.out.println("Received file of size " + myFile.getSize() + " bytes");
	  byte[] bytes = myFile.getBytes();
	  return "upload";
	}
}