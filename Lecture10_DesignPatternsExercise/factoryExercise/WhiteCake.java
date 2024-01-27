package Lecture10_DesignPatternsExercise.factoryExercise;

public class WhiteCake extends Cake{
    public WhiteCake(double diameter, double price, int pieces) {
        super(diameter, price, pieces);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing White cake...");
    }

    @Override
    public void bake() {
        System.out.println("Baking White cake...");
    }

    @Override
    public void box() {
        System.out.println("Boxing White cake...");
        System.out.println("Cake is ready!");
        System.out.printf("Your bill is %.2f!", price * pieces);
    }
}
