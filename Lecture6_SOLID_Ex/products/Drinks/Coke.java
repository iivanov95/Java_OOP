package Lecture6_SOLID_Ex.products.Drinks;

import Lecture6_SOLID_Ex.products.Drink;

public class Coke implements Drink {
    public static final double CALORIES_PER_100_GRAMS = 44.0;
    public static final double DENSITY = 0.6;
    private double milliliters;
    public double getMilliliters() {
        return milliliters;
    }
    public Coke(double milliliters) {
        this.milliliters = milliliters;
    }
    @Override
    public double amountOfCalories() {
        return (Coke.CALORIES_PER_100_GRAMS / 100) * (getMilliliters() * DENSITY);
    }
    @Override
    public double amountOfDrinks() {
        return getMilliliters() / 1000 * DENSITY;
    }
}