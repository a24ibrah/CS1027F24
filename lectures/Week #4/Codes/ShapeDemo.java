public class ShapeDemo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);            // Circle with radius 5
        shapes[1] = new Rectangle(4, 6);      // Rectangle with width 4 and height 6
        shapes[2] = new Square(4);            // Square with side length 4

        // Iterate over each shape and invoke the draw method
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.calculateArea() + "\n");
        }
    }
}
