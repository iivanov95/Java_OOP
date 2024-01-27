package Lecture4_InterfaceAndAbstractionExercise.problems123;

public class Robot implements Identifiable {
    private String Id;
    private String model;

    public Robot(String Id, String model) {
        this.Id = Id;
        this.model = model;
    }

    public String getId() {
        return this.Id;
    }

    public String getModel() {
        return this.model;
    }
}
