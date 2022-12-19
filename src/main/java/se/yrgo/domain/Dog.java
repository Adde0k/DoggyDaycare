package se.yrgo.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private String breed;
    private int age;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.startDate = LocalDateTime.now();
        this.endDate = startDate.plusWeeks(2);
    }

    public Dog(String name, String breed, int age, LocalDateTime startDate) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.startDate = startDate;
        this.endDate = startDate.plusWeeks(2);
    }

    public Dog(String name, String breed, int age, LocalDateTime startDate, LocalDateTime endDate) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        if (startDate == null) {
            this.startDate = LocalDateTime.now();
        } else {
            this.startDate = startDate;
        }
        if (endDate == null) {
            this.endDate = startDate.plusWeeks(2);
        } else {
            this.endDate = endDate;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String startDateFormatted = startDate.format(formatter);
        String endDateFormatted = endDate.format(formatter);
        return name + ", the " + breed + ", will stay from " + startDateFormatted + " until " + endDateFormatted + ".";

    }
}
