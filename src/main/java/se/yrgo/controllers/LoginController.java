package se.yrgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginController {

	@GetMapping("/login")
	public RedirectView handlelogin() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("/home");
		return redirectView;
	}
}
