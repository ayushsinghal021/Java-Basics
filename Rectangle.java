public class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3); // You can change these values to test with different dimensions
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
