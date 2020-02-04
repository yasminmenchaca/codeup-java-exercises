package shapes;

public class Rectangle {

















//    ------------------- Code from prev exercise -------------------
        // todo  It should have protected properties for both length and width.
    protected int length;
    protected int width;

    // todo Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // todo Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
    //  perimeter = 2 x length + 2 x width
    //  area = length x width

    public int getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public int getArea() {
        return this.length * this.width;
    }
}
