package Lecture5_Polymorphism.wild_farm;

public class Tiger extends Feline {
    protected Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
    @Override
    public boolean canEat(Food food) {
        return food.getClass().getSimpleName().equals("Meat");
    }
}
