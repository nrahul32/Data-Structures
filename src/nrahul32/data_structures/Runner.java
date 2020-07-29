package nrahul32.data_structures;

public class Runner {

    public static void main(String[] args) {
        
        linkedListDemo();
        stackDemo();
    }

    private static void linkedListDemo() {
        
        LinkedList list = new LinkedList();
        
        System.out.println("List at the beginning");
        list.printList();
        
        System.out.println("Adding 3 elements");
        list.addElementToList(4);
        list.addElementToList(7);
        list.addElementToList(4);
        
        System.out.println("List after adding elements:");
        list.printList();
        
        System.out.println("Adding an element at the beginning");
        list.addElementAtStart(10);
        
        System.out.println("List now:");
        list.printList();
        
        System.out.println("Adding an element at position 3");
        list.addElementAtPosition(2, 3);
        
        System.out.println("List now:");
        list.printList();
        
        System.out.println("Deleting 4th element");
        list.deleteElementAt(4);
        
        System.out.println("List now:");
        list.printList();
        
        System.out.println("Deleting 1st element");
        list.deleteElementAt(1);

        System.out.println("List now:");
        list.printList();
    }
    
    private static void stackDemo() {
        
        Stack stack = new Stack();
        
        System.out.println("Stack at the beginning");
        System.out.println("Size: " + stack.size());
        stack.printStack();
        
        System.out.println("Adding an element");
        stack.push(5);
        System.out.println("Size: " + stack.size());
        stack.printStack();
        
        System.out.println("Adding 2 more elements");
        stack.push(7);
        stack.push(5);
        System.out.println("Size: " + stack.size());
        stack.printStack();
        
        System.out.println("Peeking: " + stack.peek());
        stack.printStack();
        
        System.out.println("Popping: " + stack.pop());
        System.out.println("Size: " + stack.size());        
        stack.printStack();
        
        System.out.println("Adding an element");
        stack.push(9);
        System.out.println("Size: " + stack.size());        
        stack.printStack();

    }
}
