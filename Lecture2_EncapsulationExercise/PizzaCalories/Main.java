package Lecture2_EncapsulationExercise.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split(" ");
        Pizza pizza = new Pizza(pizzaData[1], Integer.parseInt(pizzaData[2]));
        String[] doughData = scanner.nextLine().split(" ");
        Dough dough = new Dough(doughData[1], doughData[2], Double.parseDouble(doughData[3]));
        pizza.setDough(dough);
        String toppingsData = scanner.nextLine();
        while (!toppingsData.equals("end")) {
            String[] tokens = toppingsData.split(" ");
            Topping topping = new Topping(tokens[1], Double.parseDouble(tokens[2]));
            pizza.addTopping(topping);
            toppingsData = scanner.nextLine();
        }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
