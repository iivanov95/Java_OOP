package Lecture5_Polymorphism.shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        setRadius(radius);
    }

    public final Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}
