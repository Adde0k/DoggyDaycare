package se.yrgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/allDogs")
public class DogController {
	@GetMapping("/allDogs")
    public ModelAndView firstPage() {
        ModelAndView mav = new ModelAndView("/allDogs");
		mav.addObject("h1","ul");
		mav.addObject("ul", mav);
		return mav;
    }
}