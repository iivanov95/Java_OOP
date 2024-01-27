package Lecture6_SOLID_Ex;

import Lecture6_SOLID_Ex.products.Product;

import java.util.List;

public class Printer {
    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";
    public void printSum(List<Product> products, CalorieCalculator calorieCalculator) {
        System.out.printf((SUM) + "%n", calorieCalculator.calculateSum(products));
    }
    public void printAverage(List<Product> products, CalorieCalculator calorieCalculator) {
        System.out.printf((AVERAGE) + "%n", calorieCalculator.calculateAverage(products));
    }
}