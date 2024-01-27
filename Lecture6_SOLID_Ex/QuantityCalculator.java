package Lecture6_SOLID_Ex;

import Lecture6_SOLID_Ex.products.Drink;
import Lecture6_SOLID_Ex.products.Food;

import java.util.List;

public class QuantityCalculator {
    private QuantityCalculator(){};
    public static double foodSum(List<Food> products) {
        return products.stream().mapToDouble(Food::amountOfFood).sum();
    }
    public static double drinkSum(List<Drink> products) {
        return products.stream().mapToDouble(Drink::amountOfDrinks).sum();
    }
    public static double foodAverage(List<Food> products) {
        return foodSum(products) / products.size();
    }
    public static double drinkAverage(List<Drink> products) {
        return drinkSum(products) / products.size();
    }
}