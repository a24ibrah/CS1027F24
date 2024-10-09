// Subclass for Square
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side length: " + side);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
