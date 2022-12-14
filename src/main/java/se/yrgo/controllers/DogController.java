package se.yrgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/allDogs")
public class DogController {
	@RequestMapping("/allDogs.html")
    public ModelAndView firstPage() {
        return new ModelAndView("allDogs");
    }
}