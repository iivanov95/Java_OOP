package Lecture5_PolymorphismExercise.vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        Vehicle vehicle1 = new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
        tokens = scanner.nextLine().split(" ");
        Vehicle vehicle2 = new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
        tokens = scanner.nextLine().split(" ");
        Vehicle vehicle3 = new Bus(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", vehicle1);
        vehicleMap.put("Truck", vehicle2);
        vehicleMap.put("Bus", vehicle3);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split(" ");
            double parameter = Double.parseDouble(tokens[2]);
            Vehicle vehicle = vehicleMap.get(tokens[1]);
            try {
                switch (tokens[0]) {
                    case "Drive":
                        vehicle.setEmpty(false);
                        vehicle.turnOnOffAC(vehicle.isEmpty());
                        System.out.println(vehicle.drive(parameter));
                        break;
                    case "Refuel":
                        vehicle.refuel(parameter);
                        break;
                    case "DriveEmpty":
                        vehicle.setEmpty(true);
                        vehicle.turnOnOffAC(vehicle.isEmpty());
                        System.out.println(vehicle.drive(parameter));
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        for (Vehicle value : vehicleMap.values()) {
            System.out.println(value);
        }
    }
}