package nrahul32.data_structures;

public class Runner {

    public static void main(String[] args) {
        
        linkedListDemo();

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

}
