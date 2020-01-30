import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("We are in main(String[] args");

//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(1, 2));
//        System.out.println(multiplication(1, 2));
//        System.out.println(division(1, 2));
//        System.out.println(modulus(1, 2));
//        System.out.println(foodForThought(100));
//        System.out.println(noAsterisk(100, 5));
//        System.out.println(multiplier(1,2));


//        int userInput = getInteger();
//        System.out.println("Your number is " + userInput + "!");

//        rollDie();
//        factoral();


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

//    public static int getInteger() {
//        int userInput;
//        Scanner input = new Scanner(System.in);
//        System.out.println();
//        System.out.println("Enter a number between 1 and 10: ");
//        userInput = input.nextInt();
//        if (userInput <= 10 && userInput >= 1) {
//            return userInput;
//        } else {
//            return getInteger();
//        }
//
//    }


    // TODO 3 - Calculate the factorial of a number.

//    public static void factoral() {
//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//        int factorial = 1;
//        int i;
//        while (choice.equalsIgnoreCase("y")) {
//            System.out.print("Enter your number: ");
//            int number = sc.nextInt();
//            System.out.println();
//
//            if (number > 0) {
//                for (i = 1; i <= number; i++) {
//                    factorial = factorial * i;
//                    System.out.print(i);
//                    if (i < number)
//                        System.out.print(" * ");
//                }
//                System.out.println(" = " + factorial);
//                // see if the user wants to continue
//                System.out.print("Continue? (y/n): ");
//                choice = sc.next();
//                System.out.println();
//            }
//
//        }
//    }


    //TODO Create an application that simulates dice rolling.

//    public static int getRand(int n) {
//        return (int) (Math.random() * n + 1);
//    }

//    public static void rollDie() {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("How Many Sides? ");
//        int numSides = scan.nextInt();
//        System.out.printf("You rolled: %d & %d!\n", getRand(numSides), getRand(numSides));
//        System.out.print("Roll again? y/n ");
//        if ("y".equals(scan.next().toLowerCase())) rollDie();
//    }

}