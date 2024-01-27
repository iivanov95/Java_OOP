package Lecture8_ExceptionsAndErrorHandling;

import java.util.Optional;
import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] range = scanner.nextLine().split(" ");
        int begin = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);

        System.out.println("Range: [" + begin + "..." + end + "]");
        String input = scanner.nextLine();
        while (!validInput(input, begin, end)) {

            input = scanner.nextLine();
        }
    }

    private static boolean validInput(String input, int begin, int end) {
        Optional<Integer> number = Optional.empty();
        try {
            number = Optional.of(Integer.parseInt(input));
        } catch (NumberFormatException ignored) {
        }
        boolean numberIsValid = number.isPresent()
                                && number.get() >= begin
                                && number.get() <= end;
                String output = number.isPresent()
                        ? String.format("Valid number: %d", number.get()) : String.format("Invalid number: %s", input);
        System.out.println(output);
        return numberIsValid;
    }
}
