package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerAnnotation {
	@RequestMapping("/welcome")
	protected ModelAndView helloWorld(){
		System.out.println("controller called");
		ModelAndView modelandview = new ModelAndView("welcome");
		modelandview.addObject("welcomemessage","This is my first spring mvc framework");
		return modelandview;
	}
	
	@RequestMapping("Hi")
	protected ModelAndView helloWorldTest(){
		ModelAndView model=new ModelAndView("hello");
		
		return model;
	}
}
