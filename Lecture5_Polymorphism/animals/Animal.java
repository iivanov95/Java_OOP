package Lecture5_Polymorphism.animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    protected String getName() {
        return this.name;
    }

    protected String getFavouriteFood() {
        return this.favouriteFood;
    }

    protected String explainSelf() {
        return String.format("I am %s and my favourite food is %s", this.getName(), this.getFavouriteFood());
    }
}
