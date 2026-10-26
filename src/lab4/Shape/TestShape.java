package lab4.Shape;


public class TestShape {
    public static void main(String[] args) {

        Shape s1 = new Shape();
        Shape s2 = new Shape("blue", false);

        System.out.println(s1);
        System.out.println(s2);

        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(3.0, "yellow", true);

        System.out.println("\n--- Circle ---");
        System.out.println(c1);
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());
        c2.setRadius(7.0);
        System.out.println("New radius: " + c2.getRadius());

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4.0, 6.0);
        Rectangle r3 = new Rectangle(3.0, 5.0, "blue", false);

        System.out.println("\n--- Rectangle ---");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        Square sq1 = new Square();
        Square sq2 = new Square(5.0);
        Square sq3 = new Square(4.0, "purple", true);

        System.out.println("\n--- Square ---");
        System.out.println(sq1);
        System.out.println(sq3);
        System.out.println("Side: " + sq2.getSide());
        System.out.println("Area: " + sq2.getArea());
        System.out.println("Perimeter: " + sq2.getPerimeter());

        sq2.setWidth(8.0);
        System.out.println("After setWidth(8):");
        System.out.println("Width: " + sq2.getWidth());
        System.out.println("Length: " + sq2.getLength());

        sq2.setLength(3.0);
        System.out.println("After setLength(3):");
        System.out.println("Width: " + sq2.getWidth());
        System.out.println("Length: " + sq2.getLength());

        System.out.println("\n--- Inheritance Test ---");
        Shape shape = new Circle(2.0);
        System.out.println(shape);
    }
}

