package Lecture5_Polymorphism;

public class Dog extends Mammal{
    @Override
    public void breath() {
        System.out.println("Breathing with my tongue out!");
    }
    public void fetch(){
        System.out.println("Running to fetch!");
    }
}
