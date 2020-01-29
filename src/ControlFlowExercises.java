import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //TODO 1a - While

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // for loop

//        for (int i = 5; i <= 15; i += 1) {
//            System.out.println(i);
//        }

        //TODO 1b - Do While

        // TODO Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int x = 0;
//
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x <= 100);


        // for loop

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }


        // TODO Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

        // for loop

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

        // TODO Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //  2
        //  4
        //  16
        //  256
        //  65536

//        double i = 2;
//        do {
//            System.out.printf("%n%.0f", i);
//            i *= i;
//        }
//        while (i < 1000000);

        // for loop

//        for (double i = 2; i < 1000000; i *= i) {
//            System.out.printf("%n%.0f", i);
//        }

        // TODO 2) Fizzbuzz

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // TODO Display a table of powers. Prompt the user to enter an integer. Display a table of squares and cubes from 1 to the value entered. Ask if the user wants to continue. Assume that the user will enter valid data. Only continue if the user agrees to.

        // Example output:
        //What number would you like to go up to? 5
        // Here is your table!

        // number | squared | cubed
        //------ | ------- | -----
        //1      | 1       | 1
        //2      | 4       | 8
        //3      | 9       | 27
        //4      | 16      | 64
        //5      | 25      | 125

//        Scanner sc = new Scanner(System.in);
//        String choice = "y";

//        while (choice.equalsIgnoreCase("y")) {
//            // get the input from the user
//            System.out.println("Enter an Integer: ");
//            int integerNext = sc.nextInt();
//
//            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//            System.out.println("------" + "  " + "------" + "  " + "------");
//
//            for (int i = 1; i <= integerNext; i++) {
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow(i, 3);
//
//                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
//
//                System.out.println(message);
//                System.out.println();
//            }
//            // see if the user wants to continue
//            System.out.print("Continue? (y/n): ");
//            choice = sc.next();
//            System.out.println();
//        }


        // TODO Convert given number grades into letter grades.

//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//
//        while (choice.equalsIgnoreCase("y")) {
//            // get the input from the user
//            System.out.println("Enter a numerical grade from 0 to 100: ");
//            int testScore = sc.nextInt();
//
//            char grade;
//
//            if (testScore >= 88) {
//                grade = 'A';
//            } else if (testScore >= 80) {
//                grade = 'B';
//            } else if (testScore >= 67) {
//                grade = 'C';
//            } else if (testScore >= 60) {
//                grade = 'D';
//            } else {
//                grade = 'F';
//            }
//            System.out.println("Grade = " + grade);
//            // see if the user wants to continue
//            System.out.print("Continue? (y/n): ");
//            choice = sc.next();
//            System.out.println();
//        }

    }
}