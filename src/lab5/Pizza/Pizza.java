
package lab5.Pizza;

public class Pizza {
    private double _price;
    private IShape _shape;

    public Pizza(double price, IShape shape) {
        _price = price;
        _shape = shape;
    }

    public double getPrice() {
        return _price;
    }

    public IShape getShape() {
        return _shape;
    }
}
