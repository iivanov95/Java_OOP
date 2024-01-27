package Lecture5_Polymorphism.shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        setHeight(height);
        setWidth(width);
    }

    public Double getHeight() { return this.height; }

    public Double getWidth() {
        return this.width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double calculatePerimeter() {
        return (2 * height) + (2 * width);
    }

    public Double calculateArea() {
        return this.height * this.width;
    }
}
