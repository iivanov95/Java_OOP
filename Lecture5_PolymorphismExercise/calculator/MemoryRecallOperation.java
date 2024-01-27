package Lecture5_PolymorphismExercise.calculator;

public class MemoryRecallOperation implements Operation {
    private MemoryStorage memoryStorage;

    public MemoryRecallOperation(MemoryStorage memoryStorage) {
        this.memoryStorage = memoryStorage;
    }

    @Override
    public void addOperand(int operand) {

    }

    @Override
    public int getResult() {
        return this.memoryStorage.getResult();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}
