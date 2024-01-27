package Lecture1_Abstractions_Exercise.trafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Color[] colors = Arrays.stream(scanner.nextLine().split(" "))
                .map(Color::valueOf).toArray(Color[]::new);
        int n = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLightsList = new ArrayList<>();
        for (Color color : colors) {
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLightsList.add(trafficLight);
        }
        for (int i = 1; i <= n; i++) {
            for (TrafficLight trafficLight : trafficLightsList) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }
}