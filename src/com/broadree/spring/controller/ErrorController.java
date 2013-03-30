package com.broadree.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {
	@RequestMapping("/error")
	public ModelAndView error(){
		return new ModelAndView("error", "message", "500´íÎó");
	}
}
