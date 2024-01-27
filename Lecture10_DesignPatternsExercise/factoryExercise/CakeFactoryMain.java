package Lecture10_DesignPatternsExercise.factoryExercise;

import java.util.Scanner;

public class CakeFactoryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double diameter = Double.parseDouble(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int pieces = Integer.parseInt(scanner.nextLine());

        PastryShop.orderCake(type, diameter, price, pieces);
    }
}