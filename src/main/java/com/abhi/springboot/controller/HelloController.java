package com.abhi.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/helloWorld")
	public ModelAndView hello() {
		return new ModelAndView("hello", "message", "Abhi's Message");

	}
}
