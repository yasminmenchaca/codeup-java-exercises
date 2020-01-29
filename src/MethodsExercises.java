import java.awt.*;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("We are in main(String[] args");

        int userInput = getInteger();
        System.out.println("The user entered: " + userInput);

//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(1, 2));
//        System.out.println(multiplication(1, 2));
//        System.out.println(division(1, 2));
//        System.out.println(modulus(1, 2));
//        System.out.println(foodForThought(100));
//        System.out.println(noAsterisk(100, 5));
//        System.out.println(multiplier(1,2));

    }

    // TODO 1A - Create four separate methods. Each will perform an arithmetic operation

//    public static int addition(int a, int b) {
//        return a + b;
//    }

//    public static int subtraction(int a, int b) {
//        return a - b;
//    }

//    public static int multiplication(int a, int b) {
//        return a * b;
//    }

//    public static int division(int a, int b) {
//        return a / b;
//    }

    // TODO 1D - Add a modulus method that finds the modulus of two numbers.
    //  Food for thought: What happens if we try to divide by zero? What should happen?

//    public static int modulus(int a, int b) {
//        return a % b;
//    }

//    public static int foodForThought(int a) { // will not work
//        return a / 0;
//    }
    // TODO Bonus A - Create your multiplication method without the * operator (Hint: a loop might be helpful).

//    public static int noAsterisk(int num, int times) {
//        int n = num;
//        for (int i = 1; i < times; i++) {
//            num += n;
//        }
//        return num;
//    }

    //TODO Bonus B - Do the above with recursion.

//    public static int multiplier(int a, int b) {
//        if ((a == 0) || (b == 0))
//            return 0;
//        else
//            return (a + multiplier(a, b - 1));
//    }

    // TODO 2 - Create a method that validates that user input is in a certain range.

    public static int getInteger() {

        int userInput;
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter a number between 1 and 10: ");
        userInput = input.nextInt();

        if (userInput <= 10 && userInput >= 1) {

            return userInput;
        } else {

            return getInteger();

        }

    }

}
