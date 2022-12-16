package se.yrgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	
    @GetMapping("/home")
    public ModelAndView firstPage() {
        ModelAndView mav = new ModelAndView("/newDog");
		mav.addObject("h1", mav);
		mav.addObject("form", mav);
		return mav;
    }

}

