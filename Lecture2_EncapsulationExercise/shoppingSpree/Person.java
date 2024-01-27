package Lecture2_EncapsulationExercise.shoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person implements Identity {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName(String name) {
        Validator.validateString(name);
        this.name = name;
    }

    public double getMoney() {

        return money;
    }

    private void setMoney(double money) {
        Validator.validateValueNonNegative(money);
        this.money = money;
    }
    public void buyProduct (Product product) {

        money -= product.getCost();
        this.products.add(product);
    }

    @Override
    public String toString() {
        return String.format("%s - %s",
                name, products.stream().
                        map(Product::getName).
                        collect(Collectors.joining(", ")));
    }
}