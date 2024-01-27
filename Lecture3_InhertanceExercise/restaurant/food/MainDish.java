package Lecture3_InhertanceExercise.restaurant.food;

import java.math.BigDecimal;

public class MainDish extends Food{
    private double calories;

    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }

    public double getCalories() {
        return calories;
    }
}
