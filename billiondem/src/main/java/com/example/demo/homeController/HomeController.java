package com.example.demo.homeController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String  welcome() {

		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Welcome");
		mv.addObject("ModeWelcome", true);
		mv.setViewName("welcome");
		
		
		return "Shabil Welcome to billonares";

	}
}
