package nrahul32.data_structures;

public class Stack {
    
    int top = 0;
    int capacity = 2;
    int[] stack = new int[capacity];
    
    public void push(int number) {
        
        if(top == capacity) {
            expand();
        }
        stack[top] = number;
        top++;
    }
    
    private void expand() {
        
        System.out.println("Expanding the stack's capacity form "+ capacity +" to " + capacity*2);
        int[] newStack = new int[capacity*2];
        for(int i = 0; i < top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = capacity * 2 ;
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
