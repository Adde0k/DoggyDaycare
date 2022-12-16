package se.yrgo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class LoginController {
	
	@GetMapping("/login")
    public ModelAndView firstPage() {
		ModelAndView mav = new ModelAndView("/welcome");
		mav.addObject("h1", mav);
		mav.addObject("hfref", mav);
		return mav;
    }
	
	
	// @RequestMapping("/login")
	// public ModelAndView myController(){
	// 	ModelAndView mav = new ModelAndView("/Next");
	// 	mav.addObject("hfref", mav);
	// 	return mav;
	// }

	// @GetMapping("/login")
    // public ModelAndView showNewDogForm() {
    //     ModelAndView mav = new ModelAndView("/newDog");
	// 	mav.addObject("h1", mav);
	// 	mav.addObject("form", mav);
	// 	return mav;
    // }

	// @GetMapping("/login")
    // public ModelAndView firstPage() {
    //     ModelAndView mav = new ModelAndView("/allDogs");
	// 	mav.addObject("h1","ul");
	// 	mav.addObject("ul", mav);
	// 	return mav;
    // }
	// @GetMapping("/login")
    // public ModelAndView firstPage() {
    //     ModelAndView mav = new ModelAndView("/dogInfo");
	// 	mav.addObject("h1","ul");
	// 	mav.addObject("p", mav);
	// 	return mav;
    // }
	
	
	
}
