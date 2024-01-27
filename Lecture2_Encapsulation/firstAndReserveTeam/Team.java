package Lecture2_Encapsulation.firstAndReserveTeam;

import Lecture2_Encapsulation.salaryIncrease.Person;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        setName(name);
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }
    private void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addPLayer (Person person){
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }
    public List<Person> getFirstTeam() {
        return firstTeam;
    }
    public List<Person> getReserveTeam() {
        return reserveTeam;
    }
}