package Lecture5_Polymorphism.wild_farm;

public abstract class Food {
    private Integer quantity;

    public Integer getQuantity() {
        return this.quantity;
    }

    protected Food(Integer quantity) {
        this.quantity = quantity;
    }
}
