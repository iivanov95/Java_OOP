package Lecture5_Polymorphism.math_operation;

public class MathOperation {

    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return add(add (a , b), c);
    }
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
