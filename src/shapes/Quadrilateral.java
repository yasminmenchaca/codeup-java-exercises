package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected length;
    protected width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
