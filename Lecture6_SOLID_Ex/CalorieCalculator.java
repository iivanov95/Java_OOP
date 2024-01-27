package Lecture6_SOLID_Ex;

import Lecture6_SOLID_Ex.products.Product;

import java.util.List;

public class CalorieCalculator {

    private CalorieCalculator() {}

    public static double calculateSum(List<Product> products) {
        return products.stream().mapToDouble(Product::amountOfCalories).sum();
    }

    public static double calculateAverage(List<Product> products) {
        return calculateSum(products) / products.size();
    }
}
