class Stack {
    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to hold stack elements
    private int top; // Index of the top element

    // Constructor to initialize the stack
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value; // Increment top and add value
        System.out.println("Pushed " + value + " to stack.");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return -1 or throw exception
        }
        return stackArray[top--]; // Return top value and decrement top
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return -1 or throw exception
        }
        return stackArray[top]; // Return the top value
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Display the stack elements (for debugging)
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class StackOperations {
    public static void main(String[] args) {
        // Create a stack of size 5
        Stack stack = new Stack(5);

        // Perform stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack(); // Display current stack

        System.out.println("Top element is: " + stack.peek()); // Peek at the top element

        stack.push(40);
        stack.push(50);
        stack.push(60); // This should indicate the stack is full
        stack.displayStack(); // Display current stack

        System.out.println("Popped element: " + stack.pop()); // Pop the top element
        stack.displayStack(); // Display current stack

        System.out.println("Top element is: " + stack.peek()); // Peek at the top element

        stack.pop(); // Pop another element
        stack.pop(); // Pop another element
        stack.pop(); // Pop another element
        stack.pop(); // This should indicate the stack is empty
    }
}