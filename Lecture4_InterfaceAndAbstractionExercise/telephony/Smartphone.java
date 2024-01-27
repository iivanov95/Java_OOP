package Lecture4_InterfaceAndAbstractionExercise.telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urs;

    public Smartphone(List<String> numbers, List<String> urs) {
        this.numbers = new ArrayList<>();
        this.urs = new ArrayList<>();
    }

    @Override
    public String call() {
        return null;
    }

    @Override
    public String browse() {
        return null;
    }
}