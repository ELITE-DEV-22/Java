package lab3.Stack;

public class Main {
    public static void main(String[] args) {

    Stack s = new Stack();

        s.createNew(10);

        assert s.size == 10;
        assert s.top == -1;
        assert s.empty();

        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        assert s.top == 3;
        assert !s.empty();

        assert s.stack[0] == 20;
        assert s.stack[1] == 30;
        assert s.stack[2] == 40;
        assert s.stack[3] == 50;

        int value = s.pop();

        assert value == 50;
        assert s.top == 2;

        s.display();

        System.out.println("All assertions passed!");
    }

}
