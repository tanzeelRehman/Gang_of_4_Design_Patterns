package FactoryMethodExample1;

import java.util.ArrayList;
import java.util.List;

public class FactoryDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        SquareGeomatory squareGeomatory = new SquareGeomatory();
        RectangleGeometery rectangleGeometery = new RectangleGeometery();

        shapes.add(squareGeomatory.createShape());
        shapes.add(rectangleGeometery.createShape());
        shapes.add(rectangleGeometery.createShape());

        for (Shape shape:
             shapes) {
            shape.draw();
        }
    }
}
