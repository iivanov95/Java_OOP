package Lecture3_InhertanceExercise.needForSpeed;

public class RaceMotorcycle extends Motorcycle {
    private static final double DEFAULT_FUEL_CONSUMPTION = 8.00;

    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
