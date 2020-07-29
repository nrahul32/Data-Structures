package nrahul32.data_structures;

public class Queue {
    
    // First in First out
    
    int capacity = 4;
    int[] queue = new int[capacity];
    int start=0;
    int end=0;
    int size=0;
    
    public void enQueue(int number) {
        
        if(isFull()) {
            System.out.println("Queue is full");
        } else {
            queue[end] = number;
            end = (end + 1) % capacity;
            size++;
        }
    }
    
    public int deQueue() {
        
        int number = queue[start];
        start = (start + 1) % capacity;
        size--;
        return number;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
    
    public void printQueue() {
        
        System.out.println("List:");
        for (int i = 0; i < size; i = i+1 ) {
            System.out.println(queue[(start + i)%capacity]);
        }
    }
}
