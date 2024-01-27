package Lecture5_Polymorphism;

public class Main {
    public static void main(String[] args) {

        Animal animal = createAnimal();

        Class<? extends Animal> clazz = animal.getClass();

        if (animal instanceof Cow) {
            Cow cow = (Cow) animal;
            cow.eatGrass();
            System.out.println("I am a cow!");
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch();
            System.out.println("I am a dog!");
        }
    }

    private static Animal createAnimal() {
        return new Dog();
    }
}
