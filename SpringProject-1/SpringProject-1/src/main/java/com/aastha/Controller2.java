package com.aastha;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller2 {

	
	@RequestMapping("/")
	public ModelAndView LoginPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/home.jsp");
		return mv;
	}
}
