package Lecture5_PolymorphismExercise.calculator;

public class ExtendedInterpreter extends InputInterpreter{

    private MemoryStorage memoryStorage;
    public ExtendedInterpreter(CalculationEngine engine) {
        super(engine);
        this.memoryStorage = new MemoryStorage();
    }

    @Override
    public Operation getOperation(String operation) {
        if (operation.equals("/")) {
            return new DivisionOperation();
        } else if (operation.equals("ms")) {
            return this.memoryStorage;
        } else if (operation.equals("mr")) {
            return new MemoryRecallOperation(memoryStorage);
        } else {
            return super.getOperation(operation);
        }
    }
}
