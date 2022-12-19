package se.yrgo.controllers;

import java.time.LocalDateTime;
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
@RequestMapping("/dogs")
public class DogController {
	@Autowired
	private DogRepository data;

	@RequestMapping(value = "/new-dog", method = RequestMethod.POST)
	public String newDog(Dog dog) {
		if (dog.getStartDate() == null) {
			dog.setStartDate(LocalDateTime.now());
			dog.setEndDate(dog.getStartDate().plusWeeks(2));
		}
		if (dog.getEndDate() == null) {
			dog.setEndDate(dog.getStartDate().plusWeeks(2));
		}
		data.save(dog);
		return "redirect:/dogs/list";
	}

	@RequestMapping(value = "/new-dog", method = RequestMethod.GET)
	public ModelAndView renderNewDogForm() {
		Dog newDog = new Dog();
		return new ModelAndView("newDog", "form", newDog);
	}

	@RequestMapping(value = { "/list", "", "/" }, method = RequestMethod.GET)
	public ModelAndView dogs() {
		List<Dog> allDogs = data.findAll();
		allDogs.add(new Dog("Max", "Golden Retriever", 4, LocalDateTime.of(2022, 12, 15, 0, 0, 0)));
		allDogs.add(new Dog("Clifford", "Giant Vizsla", 2, LocalDateTime.of(2022, 12, 13, 0, 0, 0)));
		allDogs.add(new Dog("Scooby", "Great Dane", 7, LocalDateTime.of(2022, 12, 19, 0, 0, 0)));
		return new ModelAndView("allDogs", "dogs", allDogs);
	}

	@RequestMapping(value = "/dog/{name}")
	public ModelAndView showDogByName(@PathVariable("name") String name) {
		Dog dog = data.findByName(name);
		return new ModelAndView("dogInfo", "dog", dog);
	}
}