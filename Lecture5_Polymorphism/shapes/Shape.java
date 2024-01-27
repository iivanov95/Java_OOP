package Lecture5_Polymorphism.shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }

    protected Double calculatePerimeter() {
        return getPerimeter();
    }
    protected Double calculateArea(){
        return getArea();
    }
}
