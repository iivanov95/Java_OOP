package Lecture6_SOLID_Ex.products.Foods;

import Lecture6_SOLID_Ex.products.Food;

public class Chips implements Food {
    public static final double CALORIES_PER_100_GRAMS = 529.0;
    private double grams;
    public double getGrams() {
        return grams;
    }
    public Chips(double grams) {
        this.grams = grams;
    }
    @Override
    public double amountOfCalories() {
        return (Chocolate.CALORIES_PER_100_GRAMS / 100) * getGrams();
    }
    @Override
    public double amountOfFood() {
        return getGrams() / 1000;
    }
}
