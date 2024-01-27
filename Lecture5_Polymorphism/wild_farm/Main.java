package Lecture5_Polymorphism.wild_farm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            Animal animal = createAnimal(line);
            Food food = createFood(scanner.nextLine());
            animal.eatFood(food);
            animal.makeSound();
            line = scanner.nextLine();
        }
    }

    private static Animal createAnimal(String line) {
        String[] tokens = line.split("\\s+");
        String type = tokens[0];
        String name = tokens[1];
        Double weight = Double.parseDouble(tokens[2]);
        Integer foodEaten = Integer.parseInt(tokens[3]);
        String livingRegion = tokens[4];
        Animal animal;
        if (type.equals("Cat")) {
            animal = new Cat(name, type, weight, foodEaten, livingRegion, tokens[4]);
        } else if (type.equals("Mouse")) {
            animal = new Mouse(name, type, weight, foodEaten, livingRegion);
        } else if (type.equals("Tiger")) {
            animal = new Tiger(name, type, weight, foodEaten, livingRegion);
        } else if (type.equals("Zebra")) {
            animal = new Zebra(name, type, weight, foodEaten, livingRegion);
        }
        return null;
    }

    private static Food createFood(String nextLine) {
        String[] tokens = nextLine.split("\\s+");
        String foodType = tokens[0];
        Integer quantity = Integer.parseInt(tokens[1]);
        return foodType.equals("Meat") ? new Meat(quantity) : new Vegetable(quantity);
    }
}
