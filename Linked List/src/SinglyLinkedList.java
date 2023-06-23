public class SinglyLinkedList {
    public SinglyNode head = null;
    
    SinglyLinkedList() {}

    void addAtEnd(int data) {
        SinglyNode node = new SinglyNode(data); // created new node using the data

        // If there is no node present, that means we have to assign head to node
        if(head == null) {
            head = node;
        }
        else { // we have already a list, so we have to linked them
            SinglyNode temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
    }

    void addAtFirst(int data) {
        SinglyNode node = new SinglyNode(data); // created new node using the data
        // If there is no node present, that means we have to assign head to node
        if(head == null) {
            head = node;
        }
        else { // we have already a list, so we have to linked them
            node.next = head;
            head = node;
        }
    }

    void deleteFromEnd() {
        if(head == null) {
            System.out.println("There is nothing to delete!!");
            return;
        }
        
        SinglyNode temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    void deleteFromStart() {
        if(head == null) {
            System.out.println("There is nothing to delete!!");
            return;
        }

        SinglyNode temp = head;
        head = temp.next;
        temp.next = null;
    }

    void deleteFromSpecificPosition(int position) { // let's say, position = 2
        if(head == null) {
            System.out.println("There is nothing to delete!!");
            return;
        }

        if(position == 1) {
            deleteFromStart();
            return;
        }
        else if(countNodes() == position) {
            deleteFromEnd();
            return;
        }
        
        SinglyNode current = head;
        SinglyNode previous = head;

        while(position != 1) {
            previous = current;
            current = current.next;
            position--;
        }

        previous.next = current.next;
        current.next = null;
    }

    int countNodes() {
        int count = 0;
       
        if(head == null) {
            System.out.println("There is nothing to count!!");
            return 0;
        }

        SinglyNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    void printLinkedList() {
        SinglyNode temp = head;
        if(temp == null) {
            System.out.println("There is nothing to print!!");
            return;
        }

        System.out.println("Printing the linked list ==> ");
        while(temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
