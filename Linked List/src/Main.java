// Notes:
// Linked List are three types -> Singly Linked List, Double Linked List, Circular Linked List

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.addAtEnd(10);
        obj.addAtEnd(20);
        obj.addAtEnd(30);
        obj.addAtEnd(40);
        obj.addAtFirst(50);
        obj.printLinkedList();
        System.out.println("There are total " + obj.countNodes() + " nodes present in the list.\n");

        obj.deleteFromEnd();
        obj.printLinkedList();
        System.out.println("There are total " + obj.countNodes() + " nodes present in the list.\n");

        obj.deleteFromStart();
        obj.printLinkedList();
        System.out.println("There are total " + obj.countNodes() + " nodes present in the list.\n");

        obj.deleteFromSpecificPosition(3);
        obj.printLinkedList();
        System.out.println("There are total " + obj.countNodes() + " nodes present in the list.\n");

        obj.addAtEnd(50);
        obj.printLinkedList();
        System.out.println("There are total " + obj.countNodes() + " nodes present in the list.\n");
    }
}
