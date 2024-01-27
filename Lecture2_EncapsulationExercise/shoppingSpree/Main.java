package Lecture2_EncapsulationExercise.shoppingSpree;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Person> people = readMap(scanner, Person::new);


        LinkedHashMap<String, Product> products = readMap(scanner, Product::new);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            String personName = tokens[0];
            String productName = tokens[1];
            Person person = people.get(personName);
            Product product = products.get(personName);
            if (person.getMoney() < product.getCost()) {
                System.out.println(person.getName() + " can't afford " + product.getName());
            } else {
                System.out.println(person.getName() + " bought " + product.getName());
            }

            input = scanner.nextLine();
        }
        people.values().stream().map(Person::toString).collect(Collectors.joining(System.lineSeparator()));
    }

    private static <T extends Identity> LinkedHashMap<String, T> readMap(Scanner scanner, BiFunction<String, Double, T> constructor) {
        return Arrays.stream(scanner.nextLine().split(";"))
                .map(s -> createEntity(s, constructor))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toMap(Identity::getName, p -> p, (x, y) -> y, LinkedHashMap::new));
    }

    public static <T> Optional<T> createEntity (String data, BiFunction<String, Double, T> constructor) {
        String[] tokens = data.split("=");
        String name = tokens[0];
        double money = Double.parseDouble(tokens[1]);

        Optional<T> entity = Optional.empty();
        try {
            entity = Optional.of(constructor.apply(name, money));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return entity;
    }
}
