package FactoryMethodExample1;

public class SquareGeomatory extends Geometery{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
