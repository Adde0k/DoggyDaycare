package se.yrgo.rest;

import se.yrgo.domain.Dog;
import java.util.List;

public class DogList {
    private List<Dog> dogs;

    public DogList() {

    }
    public DogList(List<Dog>dogs) {
        this.dogs = dogs;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }
    
}
