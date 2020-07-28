package nrahul32.data_structures;

public class LinkedList {
    
    Node head;
    
    public void addElementToList(int number) {
        
        Node newNode = new Node();
        newNode.data = number;
        newNode.next = null;
        
        if(head == null) {
            head = newNode;
        } else {
            
            Node nextNode = head;
            while(nextNode.next != null) {
                nextNode = nextNode.next;
            }
            nextNode.next = newNode;
        }
        
    }
    
    public void printList() {
        
        Node nextNode = head;
        if(head != null) {
            
            while(nextNode.next != null) {
                System.out.println(nextNode.data);
                nextNode = nextNode.next;
            }
            System.out.println(nextNode.data);  
            
        } else {
            System.out.println("List is empty");
        }
    }
    
    public void addElementAtStart(int number) {
        Node newNode = new Node();
        newNode.data = number;
        newNode.next = head;
        head = newNode;
    }
    
    public void addElementAtPosition(int number, int position) {
        
        if(position == 1) {
            addElementAtStart(number);
        } else {
            
            int index = 1;
            Node previousNode = head;
            while(index<position-1) {
                previousNode = previousNode.next;
                index++;
            }
            
            Node newNode = new Node();
            newNode.data = number;
            newNode.next = previousNode.next;
            previousNode.next = newNode;
        }
    }
    
    public void deleteElementAt(int position) {
        
        if(position==1) {
            head = head.next;
        } else {
            
            int index = 1;
            Node previousNode = head;
            
            while(index<position-1) {
                previousNode = previousNode.next;
                index++;
            }
            
            Node nodeToDelete = previousNode.next;
            previousNode.next = nodeToDelete.next;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
