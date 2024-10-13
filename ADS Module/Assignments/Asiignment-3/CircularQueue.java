class CircularQueue {
    private int[] queue;  
    private int front;    
    private int rear;    
    private int size;     
    private int count;    

    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % size;  
        queue[rear] = element;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int element = queue[front];
        front = (front + 1) % size;  
        count--;
        return element;
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == size;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4); 

        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.display();
        q.dequeue();
        q.enqueue(8);
        q.display(); 
        CircularQueue q1 = new CircularQueue(4); 

        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.display();
        q1.dequeue();
        q1.dequeue();
        q1.enqueue(5);
        q1.display(); 

    }
}
