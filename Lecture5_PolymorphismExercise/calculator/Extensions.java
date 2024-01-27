package Lecture5_PolymorphismExercise.calculator;

public class Extensions {
    private Extensions() {}

    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new ExtendedInterpreter(engine);
    }
}
