import java.awt.*;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // TODO Write some Java code that uses the variable pi to output the following: The value of pi is approximately 3.14.

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);

        // TODO Prompt a user to enter a integer and store that value in an int variable using the nextInt method

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        // TODO Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.println("You entered: --> \"" + userInput1 + "\" <--");
//        System.out.println("You entered: --> \"" + userInput2 + "\" <--");
//        System.out.println("You entered: --> \"" + userInput3 + "\" <--");

        // TODO Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user. do you capture all of the words?

        // answer: did not capture all of the words

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.next();
//        System.out.println("Your sentence: --> \"" + userSentence + "\" <--");

        // TODO Rewrite the above example using the nextLine method.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println("Your sentence: --> \"" + userSentence + "\" <--");

        // TODO Calculate the perimeter and area of Codeup's classrooms.


        // TODO Prompt the user to enter values of length and width of a classroom at Codeup. Use the nextLine method to get user input and [parse](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String) the resulting string to a numeric type. Assume that the rooms are perfect rectangles. Assume that the user will enter valid numeric data for length and width.

/*        Scanner scanner = new Scanner(System.in).useDelimiter("/n");
        System.out.println("Please enter the values of the length a classroom at Codeup.");
        String length = scanner.nextLine();
        System.out.println("Please enter the values of the width a classroom at Codeup.");
        String width = scanner.nextLine();
        System.out.println("Please enter the values of the height a classroom at Codeup.");
        String height = scanner.nextLine();
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
        int h = Integer.parseInt(height);
        System.out.println("The area is " + (l * w));
        System.out.println("The perimeter is " + ((2 * l) + (2 * w)));
        System.out.println("The volume is " + (l * w * h));*/


        // TODO Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter the value of the length of classroom at Codeup.");
        int length = scanner.nextInt();
        System.out.println("Please enter the value of the width of classroom at Codeup.");
        int width = scanner.nextInt();
        System.out.println("Please enter the values of the height a classroom at Codeup.");
        int height = scanner.nextInt();
        System.out.println("The area is " + (length * width));
        System.out.println("The perimeter is " + ((2 * length) + (2 * width)));
        System.out.println("The volume is " + (length * width * height));

    }
}
