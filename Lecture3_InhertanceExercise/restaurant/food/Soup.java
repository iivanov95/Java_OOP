package Lecture3_InhertanceExercise.restaurant.food;

import java.math.BigDecimal;

public class Soup extends Starter{
    public Soup(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
