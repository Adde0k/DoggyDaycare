package se.yrgo.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.yrgo.domain.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
    public Dog findByName(String name);
    public List<Dog> findAll();
}
