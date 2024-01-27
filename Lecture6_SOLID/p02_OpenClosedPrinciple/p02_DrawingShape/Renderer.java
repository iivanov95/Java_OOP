package Lecture6_SOLID.p02_OpenClosedPrinciple.p02_DrawingShape;

import Lecture6_SOLID.p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.Shape;

public class Renderer {
    public void draw (Shape shape){
        double area = shape.getArea();
        for (int i = 0; i < area; i++) {
            System.out.println("*");
        }
    }
}
