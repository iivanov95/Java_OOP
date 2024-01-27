package Lecture5_Polymorphism.wild_farm;

public abstract class Feline extends Mammal {

    protected Feline(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }
}
