package Lecture6_SOLID_Ex.products.Drinks;

import Lecture6_SOLID_Ex.products.Drink;

public class Lemonade implements Drink {
    public static final double CALORIES_PER_100_GRAMS = 53.0;
    public static final double DENSITY = 0.7;
    private double milliliters;
    public double getMilliliters() {
        return milliliters;
    }
    public Lemonade(double milliliters) {
        this.milliliters = milliliters;
    }
    @Override
    public double amountOfCalories() {
        return (Lemonade.CALORIES_PER_100_GRAMS / 100) * getMilliliters() * DENSITY;
    }
    @Override
    public double amountOfDrinks() {
        return getMilliliters() / 1000 * DENSITY;
    }
}