package se.yrgo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import se.yrgo.data.DogRepository;
import se.yrgo.domain.Dog;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class DogRestController {

        @Autowired
        private DogRepository data;

        @RequestMapping("/dogs")
        public DogList allDogs() {
            List<Dog>all = data.findAll();
            return new DogList(all);
    }

    @RequestMapping(value = "/dogs", method = RequestMethod.POST)
    public ResponseEntity createANewDog(@RequestBody Dog dog) {
            data.save(dog);
            return new ResponseEntity<Dog>(dog, HttpStatus.CREATED);
    }
    
}
