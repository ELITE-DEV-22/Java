package lab5.Pizza;


public class Circle implements IShape {
    private double _radius;

    public Circle(double radius) {
        _radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * _radius * _radius;
    }
}

