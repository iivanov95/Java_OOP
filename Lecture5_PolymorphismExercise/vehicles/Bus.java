package Lecture5_PolymorphismExercise.vehicles;

public class Bus extends AbstractVehicle {
    private static final boolean DEFAULT_IS_EMPTY = true;
    private boolean isEmpty;
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.isEmpty = DEFAULT_IS_EMPTY;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        this.isEmpty = empty;
    }

    public void turnOnOffAC(boolean isEmpty) {
        if (isEmpty) {
            super.setFuelConsumption(getFuelConsumption());
        } else {
            super.setFuelConsumption(getFuelConsumption() + 1.4);
        }
    }
}