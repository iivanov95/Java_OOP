package Lecture3_Inheritance.RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> numbers = new RandomArrayList<Integer>();
        numbers.add(13);
        numbers.add(26);
        numbers.add(69);
        System.out.println(numbers.getRandomElement());
    }
}