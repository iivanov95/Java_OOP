package Lecture10_DesignPatternsExercise.Hashcode;

public class Main {
    public static void main(String[] args) {
        Hashcode instance1 = Hashcode.getInstance("SoftUni!");
        Hashcode instance2 = Hashcode.getInstance("Hello!");

        System.out.println(instance1.getPoint().hashCode());
        System.out.println(instance2.getPoint().hashCode());
    }
}
