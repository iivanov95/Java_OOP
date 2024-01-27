package Lecture4_InterfaceAndAbstractionExercise.problems123;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> personMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] person = scanner.nextLine().split(" ");
            String name = person[0];
            int age = Integer.parseInt(person[1]);

            if (person.length == 4) {
                Citizen citizen = new Citizen(name, age, person[2], person[3]);
                personMap.put(name, citizen);
            } else {
                Rebel rebel = new Rebel(name, age, person[2]);
                personMap.put(name, rebel);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String name = command;
            if (personMap.containsKey(name)) {
                Buyer buyer = personMap.get(name);
                buyer.buyFood();
            }
            command = scanner.nextLine();
        }
        int sum = personMap.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(sum);
    }
}