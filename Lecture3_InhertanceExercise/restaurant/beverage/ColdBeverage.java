package Lecture3_InhertanceExercise.restaurant.beverage;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage{
    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
