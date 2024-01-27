package Lecture4_InterfaceAndAbstractionExercise.collection_hierarchy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Collection {
    private int maxSize = 100;
    private List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
    }

    public List<String> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public void addItems(String item) {
        this.items.add(item);
    }
    public void addFirst(String item) {
        this.items.add(0, item);
    }

    public int getMaxSize() {
        return this.maxSize;
    }
    public String removeFirst() {
        return this.items.remove(0);
    }
    public String removeLast() {
        return this.items.remove(this.items.size() - 1);
    }
}