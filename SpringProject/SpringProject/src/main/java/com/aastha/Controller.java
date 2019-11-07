package com.aastha;


	
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.servlet.ModelAndView;


	@RestController
	public class Controller 
	{
		@RequestMapping("/")
		public ModelAndView LoginPage()
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("Home.jsp");
			return mv;
		}

		@RequestMapping("/Registration")
		public ModelAndView RegistrationPage()
		{
			ModelAndView mv=new ModelAndView();
			mv.setViewName("Registration.jsp");
			return mv;
		}
		
	}

