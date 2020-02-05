package shapes;

// TODO Create a class named Square, also inside of shapes, that extends Rectangle
public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
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
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

//    ------------------- Code from prev exercise -------------------
    // TODO Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side

    //  Whenever a parent and child class have same named methods then to resolve ambiguity we use super keyword.

//    public Square(double side) {
//        super(side, side);
//    }

    // TODO override the getArea and getPerimeter methods

//    public double getPerimeter() {
//        return 4 * this.length;
//    }

//    public double getArea() {
//        return Math.pow(this.length, 2);
//    }

}
