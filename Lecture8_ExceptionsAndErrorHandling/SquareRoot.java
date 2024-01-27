package Lecture8_ExceptionsAndErrorHandling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = -1;
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException ignored) {
        }
        if (n >= 0) {
            double result = Math.sqrt(n);
            System.out.printf("%.2f%n", result);
        } else {
            System.out.println("Invalid");
        }
        System.out.println("Goodbye");
    }
}