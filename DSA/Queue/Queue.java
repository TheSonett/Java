package Queue;

public class Queue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;

    public Queue() {}

    public Queue(int size) {
        this.size = size;
        queue = new int[this.size];

        this.front = this.rear = 0;
    }

    // enqueue or insertion
    public void enqueue(int data) {
        if(rear == size) {
            System.out.println("Queue is full!!");
            return;
        }

        queue[rear] = data;
        rear++;
    }

    // dequeue or deletion
    public void dequeue() {
        if(front == rear) {
            System.out.println("Queue is empty!!");
            return;
        }
        
        System.out.println("You dequeued an element => " + queue[front]);
        queue[front] = 0;
        front++;
    }

    public void printQueue() {
        if(front == rear) {
            System.out.println("There is nothing to print!!");
            return;
        }
        
        for(int i = front; i < rear; i++) {
            if(queue[i] != 0) {
                System.out.print(" <= " + queue[i]);
            }
        }
        System.out.println();
    }

}
