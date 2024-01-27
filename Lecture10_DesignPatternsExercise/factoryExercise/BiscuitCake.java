package Lecture10_DesignPatternsExercise.factoryExercise;

public class BiscuitCake extends Cake {
    public BiscuitCake(double diameter, double price, int pieces) {
        super(diameter, price, pieces);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Biscuit cake...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Biscuit cake...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Biscuit cake...");
        System.out.println("Cake is ready!");
        System.out.printf("Your bill is %.2f!", price * pieces);
    }
}
