package Lecture5_Polymorphism.wild_farm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }
    public abstract boolean canEat(Food food);
    public abstract void makeSound();
    public void eatFood(Food food) {
        if (canEat(food)) {
            foodEaten += food.getQuantity();
        } else {
            System.out.println(getClass().getSimpleName() + " are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
