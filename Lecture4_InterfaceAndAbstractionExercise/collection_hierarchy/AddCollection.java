package Lecture4_InterfaceAndAbstractionExercise.collection_hierarchy;

public class AddCollection extends Collection implements Addable {
    @Override
    public int add(String item) {
        this.addItems(item);
        return this.getItems().size() - 1;
    }
}