
package lab5.Calculator;

public class Test_Calculator {

    public static void main(String[] args) {

        Calculator calc = BasicCalculator.getInstance();

        System.out.println("--- CALCULATOR TESTS ---");

        // Test addition
        calc.clearAll();
        calc.put(10).put(5).add();
        check("Addition", calc.read(), 15);

        // Test subtraction
        calc.clearAll();
        calc.put(10).put(5).sub();
        check("Subtraction", calc.read(), 5);

        // Test multiplication
        calc.clearAll();
        calc.put(10).put(5).mul();
        check("Multiplication", calc.read(), 50);

        // Test division
        calc.clearAll();
        calc.put(10).put(5).div();
        check("Division", calc.read(), 2);

        // Test negation
        calc.clearAll();
        calc.put(7).neg();
        check("Negation", calc.read(), -7);

        // Test read
        calc.clearAll();
        calc.put(25);
        check("Read", calc.read(), 25);

        // Test clear
        calc.clearAll();
        calc.put(10).put(5).clear();
        check("Clear", calc.read(), 10);

        // Test clearAll
        calc.clearAll();
        calc.put(10).put(5).clearAll();

        try {
            calc.read();
            System.out.println("Clear all: FAIL");
        } catch (IllegalStateException e) {
            System.out.println("Clear all: PASS");
        }

        // Test singleton
        Calculator calc2 = BasicCalculator.getInstance();
        check("Singleton", calc == calc2);

    }

    static void check(String test, int actual, int expected) {
        if (actual == expected) {
            System.out.println(test + ": PASS");
        } else {
            System.out.println(test + ": FAIL"
                    + " (Expected " + expected
                    + ", got " + actual + ")");
        }
    }

    static void check(String test, boolean condition) {
        if (condition) {
            System.out.println(test + ": PASS");
        } else {
            System.out.println(test + ": FAIL");
        }
    }
}
