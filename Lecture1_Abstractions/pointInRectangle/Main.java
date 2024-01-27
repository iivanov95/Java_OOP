package Lecture1_Abstractions.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = readArray(scanner);
        Rectangle rectangle = new Rectangle(coordinates[0],
                coordinates[1], coordinates[2], coordinates[3]);
        int pointsCount = Integer.parseInt(scanner.nextLine());
        while (pointsCount > 0) {
            int[] pointCoordinate = readArray(scanner);
            Point p = new Point(pointCoordinate[0], pointCoordinate[1]);
            System.out.println(rectangle.contains(p));
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
