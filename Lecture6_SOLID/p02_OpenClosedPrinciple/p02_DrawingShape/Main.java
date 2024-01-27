package Lecture6_SOLID.p02_OpenClosedPrinciple.p02_DrawingShape;

import Lecture6_SOLID.p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.DrawingManager;

public class Main {
    public static void main(String[] args) {
        DrawingManager drawingManager = new DrawingManagerImpl(new Renderer());

    }
}
