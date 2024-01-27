package Lecture4_InterfaceAndAbstractionExercise.telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).toList();
        List<String> sitesToVisit = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Smartphone smartphone = new Smartphone(phoneNumbers, sitesToVisit);

    }
}
