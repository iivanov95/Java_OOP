package Lecture5_Polymorphism.wild_farm;

public abstract class Mammal extends Animal {

    protected Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
    }
    @Override
    public boolean canEat(Food food) {
        return food.getClass().getSimpleName().equals("Vegetable");
    }
}
