class Stack {
    private final int maxSize;  // Maximum size of the stack
    private final int[] stackArray;  // Array to store stack elements
    private int top;  // Top of the stack

    // Constructor to initialize stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Stack is initially empty
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value);
        }
    }

    // Pop method to remove an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peek method to view the top element of the stack
    public int peek() {
        if (top == -1) {
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
}

// Main class to test the Stack
public class StackExamples {
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);  // This will show "Stack is full."

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
