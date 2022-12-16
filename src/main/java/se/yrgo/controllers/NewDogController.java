package se.yrgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/newDogC")
public class NewDogController {
	@GetMapping("/newDogC")
    public ModelAndView showNewDogForm() {
        ModelAndView mav = new ModelAndView("/newDogC");
		mav.addObject("h1", mav);
		mav.addObject("form", mav);
		return mav;
    }
}