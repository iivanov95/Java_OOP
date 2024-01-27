package Lecture1_Abstractions_Exercise.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        fillMatrix(rows, cols, matrix);

        String command = scanner.nextLine();
        int sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] evilPositions = readPositions(scanner.nextLine());
            int evilRow = evilPositions[0];
            int evilCol = evilPositions[1];

            moveEvil(matrix, evilRow, evilCol);

            int[] jediPositions = readPositions(command);
            int jediRow = jediPositions[0];
            int jediCol = jediPositions[1];

            int collectStars = getCollectedStars(matrix, jediRow, jediCol);
            sum += collectStars;
            command = scanner.nextLine();
        }
        System.out.println(sum);
    }

    private static int getCollectedStars(int[][] matrix, int jediRow, int jediCol) {
        int countStars = 0;
        while (jediRow >= 0 && jediCol < matrix[1].length) {
            if (jediRow < matrix.length && jediCol >= 0 && jediCol < matrix[0].length) {
                countStars += matrix[jediRow][jediCol];
            }
            jediCol++;
            jediRow--;
        }
        return countStars;
    }

    private static void moveEvil(int[][] matrix, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < matrix.length && evilCol < matrix[0].length) {
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static int[] readPositions(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillMatrix(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = value++;
            }
        }
    }
}
