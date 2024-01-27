package Lecture5_Polymorphism.wild_farm;

public class Cat extends Feline{
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public boolean canEat(Food food) {
        return true;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }
}
