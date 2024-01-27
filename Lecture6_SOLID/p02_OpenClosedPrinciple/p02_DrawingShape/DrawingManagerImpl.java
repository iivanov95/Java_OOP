package Lecture6_SOLID.p02_OpenClosedPrinciple.p02_DrawingShape;


import Lecture6_SOLID.p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.DrawingManager;
import Lecture6_SOLID.p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {

    private Renderer renderer;

    public DrawingManagerImpl(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public void draw(Shape shape) {
        renderer.draw(shape);
    }
}
