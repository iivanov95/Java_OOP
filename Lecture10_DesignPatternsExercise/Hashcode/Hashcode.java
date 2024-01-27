package Lecture10_DesignPatternsExercise.Hashcode;

public class Hashcode {
    private String point;
    private static Hashcode instance;

    private Hashcode(String point) {
        this.point = point;
    }

    public static Hashcode getInstance(String point) {
        if (instance == null) {
            instance = new Hashcode(point);
        }
        Hashcode hashcode = new Hashcode(point);
        return instance;
    }

    public String getPoint() {
        return point;
    }
}
