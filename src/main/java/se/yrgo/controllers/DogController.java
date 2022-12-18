package se.yrgo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import se.yrgo.data.DogRepository;
import se.yrgo.domain.Dog;

@Controller
@RequestMapping("/home/dogs")
public class DogController {
	@Autowired
	private DogRepository data;

	@RequestMapping(value = "/newDog.html", method = RequestMethod.POST)
	public String newDog(Dog dog) {
		data.save(dog);
		return "redirect:/home/dogs/allDogs";
	}

	@RequestMapping(value = "/newDog.html", method = RequestMethod.GET)
	public ModelAndView renderNewDogForm() {
		Dog newDog = new Dog();
		return new ModelAndView("newDog", "form", newDog);
	}

	@RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView dogs() {
        List<Dog> allDogs = data.findAll();
        return new ModelAndView("allDogs", "dogs",
                allDogs);
	}

	@RequestMapping(value = "/dog/{name}")
	public ModelAndView showDogByName(@PathVariable("name") String name) {
		Dog dog = data.findByName(name);
		return new ModelAndView("dogInfo", "dog", dog);
	}
}