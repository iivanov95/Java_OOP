package Lecture2_EncapsulationExercise.PizzaCalories;

import java.util.Map;

public class Topping {

    private static final Map<String, Double> toppingsTable =  Map.of("Meat", 1.2,
"Veggies", 0.8,"Cheese", 1.1,"Sauce",0.9);

    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(toppingType + "%s weight should be in the range [1..50].");
        }
        this.weight = weight;
    }
    public double calculateCalories () {
        return 2 * weight * toppingsTable.get(toppingType);
    }
}
