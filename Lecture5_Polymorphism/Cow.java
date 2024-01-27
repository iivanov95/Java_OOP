package Lecture5_Polymorphism;

public class Cow extends Mammal {
    @Override
    public void breath() {
        System.out.println("I am breathing!");
    }
    public void eatGrass() {
        System.out.println("Eating grass!");
    }
}
