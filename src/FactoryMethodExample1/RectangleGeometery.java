package FactoryMethodExample1;

public class RectangleGeometery  extends  Geometery{

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
