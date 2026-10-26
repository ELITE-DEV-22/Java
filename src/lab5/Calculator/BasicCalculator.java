
package lab5.Calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class BasicCalculator implements Calculator {

    private static final BasicCalculator instance =
            new BasicCalculator();

    private Deque<Integer> numbers = new ArrayDeque<>();

    private BasicCalculator() {
    }

    public static Calculator getInstance() {
        return instance;
    }

    @Override
    public Calculator put(int n) {
        numbers.push(n);
        return this;
    }

    @Override
    public int read() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Calculator is empty");
        }

        return numbers.peek();
    }

    @Override
    public Calculator neg() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("No number available");
        }

        numbers.push(-numbers.pop());
        return this;
    }

    @Override
    public Calculator add() {
        return calculate('+');
    }

    @Override
    public Calculator sub() {
        return calculate('-');
    }

    @Override
    public Calculator mul() {
        return calculate('*');
    }

    @Override
    public Calculator div() {
        return calculate('/');
    }

    private Calculator calculate(char operation) {
        if (numbers.size() < 2) {
            throw new IllegalStateException(
                    "Two numbers are required");
        }

        int right = numbers.peek();

        if (operation == '/' && right == 0) {
            throw new ArithmeticException("Division by zero");
        }

        numbers.pop();
        int left = numbers.pop();

        int result = 0;

        switch (operation) {
            case '+':
                result = left + right;
                break;

            case '-':
                result = left - right;
                break;

            case '*':
                result = left * right;
                break;

            case '/':
                result = left / right;
                break;
        }

        numbers.push(result);
        return this;
    }

    @Override
    public Calculator clear() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("Calculator is empty");
        }

        numbers.pop();
        return this;
    }

    @Override
    public Calculator clearAll() {
        numbers.clear();
        return this;
    }
}
