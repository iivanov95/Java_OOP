package Lecture10_DesignPatternsExercise.factoryExercise;

public class PastryShop {
    private PastryShop(){}

    public static Cake orderCake(String type, double diameter, double price, int pieces){
        Cake cake = CakeFactory.createCake(type, diameter, price, pieces);
        cake.prepare();
        cake.bake();
        cake.box();
        return cake;
    }
}
