package Stack;

public class ArrayStack {
    static int[] stack;
    static int top = 0;

    ArrayStack(int SIZE) {
        top = -1;
        stack = new int[SIZE];
    }

    public void push(int element) {
        if(top == stack.length - 1) {
            System.out.println("Buffer Overflow!!");
        }
        else {
            stack[++top] = element;
        }
    }

    public void pop() {
        if(top == -1) {
            System.out.println("There is no element to remove!!");
            return;
        }

        System.out.println("Popped element: " + stack[top]);
        stack[top--] = 0;
    }

    public void top() {
        if(top == -1) {
            System.out.println("There is no element on peek!!");
        }
        else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    public void printStack() {
        System.out.println("Updated stack elements are ==> ");
        for (int j : stack) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
