package se.yrgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HomeController {
    @RequestMapping("/home.html")
    public ModelAndView firstPage() {
        return new ModelAndView("welcome");
    }

}

