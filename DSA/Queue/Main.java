package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();
    }
}
