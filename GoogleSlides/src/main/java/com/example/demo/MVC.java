package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVC {
	
	@RequestMapping("/")
	ModelAndView landingPage()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register.jsp");
		return mv;
	}
	
}
