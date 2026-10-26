package lab5.Pizza;

public class Test_Pizza {

    public static void main(String[] args) {

        // Create shapes with different dimensions
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        Circle circle = new Circle(3.0);

        // Create pizzas with their respective shapes and prices
        Pizza pizza1 = new Pizza(250.0, rectangle);
        Pizza pizza2 = new Pizza(180.0, circle);

        System.out.println("--- PIZZA TEST CASES ---");

        // Test 1: Rectangle area
        check("Rectangle area",
                rectangle.getArea(), 20.0);

        // Test 2: Circle area
        check("Circle area",
                circle.getArea(), Math.PI * 9.0);

        // Test 3: Rectangle pizza shape
        check("Rectangle pizza shape",
                pizza1.getShape() instanceof Rectangle);

        // Test 4: Circle pizza shape
        check("Circle pizza shape",
                pizza2.getShape() instanceof Circle);

        // Test 5: Rectangle pizza price
        check("Rectangle pizza price",
                pizza1.getPrice(), 250.0);

        // Test 6: Circle pizza price
        check("Circle pizza price",
                pizza2.getPrice(), 180.0);

        // Display pizza information
        System.out.println("\n--- PIZZA DETAILS ---");

        displayPizza(pizza1);
        displayPizza(pizza2);
    }

    // Test double values with a small tolerance
    static void check(String testName,
                      double actual, double expected) {

        if (Math.abs(actual - expected) < 0.0001) {
            System.out.println(testName + ": PASS");
        } else {
            System.out.println(testName + ": FAIL");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }

    // Test a boolean condition
    static void check(String testName, boolean condition) {
        if (condition) {
            System.out.println(testName + ": PASS");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    // Display pizza price, shape and area
    static void displayPizza(Pizza pizza) {
        IShape shape = pizza.getShape();

        System.out.println("Price: " + pizza.getPrice());

        if (shape instanceof Rectangle) {
            System.out.println("Shape: Rectangle");
        } else if (shape instanceof Circle) {
            System.out.println("Shape: Circle");
        }

        System.out.println("Area: " + shape.getArea());
        System.out.println();
    }
}

