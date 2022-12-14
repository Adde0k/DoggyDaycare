package se.yrgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/newDog")
public class NewDogController {
	@RequestMapping("/newDog.html")
    public ModelAndView firstPage() {
        return new ModelAndView("allDogs");
    }
}