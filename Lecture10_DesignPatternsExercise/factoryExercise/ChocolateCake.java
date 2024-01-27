package Lecture10_DesignPatternsExercise.factoryExercise;

public class ChocolateCake extends Cake{
    public ChocolateCake(double diameter, double price, int pieces) {
        super(diameter, price, pieces);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chocolate cake...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chocolate cake...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chocolate cake...");
        System.out.println("Cake is ready!");
        System.out.printf("Your bill is %.2f!", price * pieces);
    }
}
