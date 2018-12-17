package com.techtalentsouth.LightenUp.Home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	
	@Autowired
	private HomeRepository homeRepository;
	
	@GetMapping("/")
	public ModelAndView home(Home home) {
		ModelAndView mv = new ModelAndView("home/home");
		return mv;
	}

	@GetMapping("/all")
	public ModelAndView index(Home home) {
		ModelAndView mv = new ModelAndView("home/index");
		mv.addObject("homes", homeRepository.findAll());
		return mv;
	}
	
	@GetMapping("/home/show/{id}")
	public ModelAndView show(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("home/show");
		Optional<Home> home = homeRepository.findById(id);
		mv.addObject("home", home);
		return mv;
	}
	
	@GetMapping("/home/create")
	public ModelAndView newBlog(Home home) {
		ModelAndView mv = new ModelAndView("home/create");
		return mv;
	}
	
	@PostMapping("/home/create")
	public ModelAndView create(Home home) {
		ModelAndView mv = new ModelAndView("home/show");
		Home myHome = homeRepository.save(home);
		mv.addObject("home", myHome);
		return mv;
	}

}