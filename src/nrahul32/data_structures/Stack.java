package nrahul32.data_structures;

public class Stack {
    
    int top = 0;
    int[] stack = new int[10];
    
    public void push(int number) {
        stack[top] = number;
        top++;
    }
    
    public int pop() {
        
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            top--;
            int number = stack[top];
            stack[top] = 0;
            return number;
        }
    }
    
    public int peek() {
        
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[top-1];
        }
    }
    
    public int size() {
        return top;
    }
    
    public boolean isEmpty() {
        if(top == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack:");
            for (int i = 0; i<top ; i++) {
                System.out.println(stack[i]);
            }
        }
    }
}
