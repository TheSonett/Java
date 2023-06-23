// Notes:
// It is a linear data structure
// It follows LIFO or FILO

// Time Complexity:
//  -> Insertion and Deletion O(1)
//  -> Searching and editing O(n)
// Space Complexity: O(n)


public class Main {

    public static void main(String[] args) {
        ArrayStack obj = new ArrayStack(5);

        obj.push(10);
        obj.printStack();
    }
}
