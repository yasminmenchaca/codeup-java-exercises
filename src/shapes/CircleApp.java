package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        circleInfo();
    }


    public static void circleInfo() {
        Input input = new Input();
        double userRadius = input.getDouble();
        Circle circle = new Circle(userRadius);
        System.out.println("The area is " + circle.getArea());
        System.out.println("The area circumference " + circle.getCircumference());
    }

}