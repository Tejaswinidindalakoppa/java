// Stack Implementation in Java
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Method to add an element to the stack (push)
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Unable to push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value);
        }
    }

    // Method to remove and return the top element (pop)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No element to pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Method to view the top element without removing it (peek)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack of size 5

        stack.push(10); // Push elements to the stack
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Peek the top element

        System.out.println("Popped element: " + stack.pop()); // Pop an element
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty()); // Check if stack is empty
    }
}
