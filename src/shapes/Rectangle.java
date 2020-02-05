package shapes;

// todo inherit from Quadrilateral and implement Measurable.
public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

//------------------- Code from prev exercise -------------------
    // todo  It should have protected properties for both length and width.
//    protected double length;
//    protected double width;

    // todo Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.

//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

    // todo Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
    //  perimeter = 2 x length + 2 x width
    //  area = length x width

//    public double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }

//    public double getArea() {
//        return this.length * this.width;
//    }
}