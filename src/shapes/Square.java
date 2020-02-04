package shapes;

// TODO Create a class named Square, also inside of shapes, that extends Rectangle
public class Square extends Rectangle {

    // TODO Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side

    //  Whenever a parent and child class have same named methods then to resolve ambiguity we use super keyword.

    public Square(int side) {
        super(side, side);
    }

    // TODO override the getArea and getPerimeter methods

    public int getPerimeter() {
        int side = super.width;
        return 4 * side;
    }

    public int getArea() {
        int side = super.width;
        return (int) Math.pow(side, 2);
    }

}
