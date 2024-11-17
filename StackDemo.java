// Java program to demonstrate Stack using a class
class Stack {
    private final int[] stack;
    private int top;
    private final int size;

    // Constructor to initialize the stack
    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1; // stack is empty initially
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! Cannot add " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed onto stack.");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Method to display the stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

// Main class to test the Stack
public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack(5); // Create a stack of size 5

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.display();

        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Top element is: " + myStack.peek());
        myStack.display();
    }
}
