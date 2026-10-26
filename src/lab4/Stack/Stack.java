package lab3.Stack;

public class Stack {
    int stack[];
    int top;
    int size;

    void createNew(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value){
        if (top == size -1){
            System.out.println("Stack is full");
        }
        else{
            top++;
            stack[top] = value;
        }
    }
    int pop(){
        if (top == -1){
            System.out.println("Stack is empty");
        }
        else{
            int p = stack[top];
            top--;
            return p;
        }
        return 0;
    }
    void display(){
        if (empty()){
            System.out.println("Stack is empty");

        }
        else{
            for (int i = 0; i <= top; i++){
                System.out.println(stack[i]);
            }
        }
    }
    boolean empty(){
        return top == -1;
    }
}
