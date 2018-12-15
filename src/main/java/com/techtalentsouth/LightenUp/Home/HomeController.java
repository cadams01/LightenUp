package com.techtalentsouth.LightenUp.Home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	private HomeRepository homeRepository;
	
	@GetMapping("/")
	public ModelAndView index(Home home) {
		ModelAndView mv = new ModelAndView("home/index");
		mv.addObject("homes", homeRepository.findAll());
		return mv;
	}

}
