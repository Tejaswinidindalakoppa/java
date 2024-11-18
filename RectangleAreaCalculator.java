// Program to calculate the area of a rectangle
public class RectangleAreaCalculator {
    public static void main(String[] args) {
        // Declare variables
        double length = 5.0; // Length of the rectangle
        double width = 3.0; // Width of the rectangle

        // Create an object of the Rectangle class
        Rectangle rect = new Rectangle(length, width);

        // Display the area
        System.out.println("The area of the rectangle is: " + rect.calculateArea());
    }
}

// Rectangle class with attributes and method
class Rectangle {
    double length;
    double width;

    // Constructor to initialize length and width
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    double calculateArea() {
        return length * width;
    }
}
