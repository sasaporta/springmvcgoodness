package com.stevesaporta.springmvcgoodness.controller;
 
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.stevesaporta.springmvcgoodness.entity.Wrapper;
 
@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String redirect() {
		return "redirect:/test";
	}
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String displayForm(Wrapper wrapper) {
		return "test";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public ModelAndView formSubmitted(Wrapper wrapper, @RequestParam("myfile") MultipartFile myFile) throws IOException {
		// If desired, you can get the file contents as an array of bytes, as in the commented line below. 
		//byte[] bytes = myFile.getBytes();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("thankyou");
		modelAndView.addObject("wrapper", wrapper);
		modelAndView.addObject("fileName", myFile.getOriginalFilename());
		modelAndView.addObject("fileSize", myFile.getSize());
		return modelAndView;
	}
}