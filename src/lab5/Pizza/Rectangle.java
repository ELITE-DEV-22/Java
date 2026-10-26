package lab5.Pizza;


public class Rectangle implements IShape {
    private double _height;
    private double _width;

    public Rectangle(double height, double width) {
        _height = height;
        _width = width;
    }

    @Override
    public double getArea() {
        return _height * _width;
    }
}

