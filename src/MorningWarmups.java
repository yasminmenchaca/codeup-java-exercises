import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MorningWarmups {
//    public static void main(String[] args) {

//        System.out.println(noAsterisk(100, 5));
//        consoleWrite();
//        System.out.println(divide(0, 0));
//    }

    // TODO Create your multiplication method without the * operator (Hint: a loop might be helpful).

//    public static long noAsterisk(long num, long times) {
//        long n = num;
//        for (long i = 1; i < times; i++) {
//            num += n;
//        }
//        return num;
//    }

    // TODO Write a Java program to add two binary numbers.


//    public static class addBinary {
//        public static void main(String[] args) {
//            long binary1, binary2;
//            int i = 0, remainder = 0;
//            int[] sum = new int[20];
//            Scanner in = new Scanner(System.in);
//
//            System.out.print("Input first binary number: ");
//            binary1 = in.nextLong();
//            System.out.print("Input second binary number: ");
//            binary2 = in.nextLong();
//
//            while (binary1 != 0 || binary2 != 0) {
//                sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
//                remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
//                binary1 = binary1 / 10;
//                binary2 = binary2 / 10;
//            }
//            if (remainder != 0) {
//                sum[i++] = remainder;
//            }
//            --i;
//            System.out.print("Sum of two binary numbers: ");
//            while (i >= 0) {
//                System.out.print(sum[i--]);
//            }
//            System.out.print("\n");
//        }
//    }

// todo Create a String[] with at least 6 String objects. Also create an empty ArrayList<String>. Then loop over the array and put the items into the ArrayList so that we have the same contents

//    String[] fruits = {"banana", "orange", "apple", "grape", "mango", "melon"};
//    ArrayList<String> arr = new ArrayList<>();

    // TODO write a java program that reads in a series of 3-5 lines and then writes them out to the console

//    public static void consoleWrite() {
//        String[] data = {"Hello, my name is Yasmin",
//                "I am trying to write in a console.",
//                "Today is Monday.",
//                "The weather will change in the afternoon.",
//                "Stack Overflow is my best friend"};
//        for (String s : data) {
//            System.out.println(s);
//        }
//    }

//    public static double divide(double a, double b) throws ArithmeticException {
//        double quotient = 0.0;
//        if (b == 0) {
//            throw new ArithmeticException("Attempt to divide by zero in divide");
//        }
//        quotient = (double) a / b;
//        return quotient;
//    }


    /**
     * Exercise 071 - Find Factors Efficiently
     * Find all of the factors for a given integer (int). The integer could be negative. The result needs to be sorted
     * in ascending order.
     * <p>
     * The solution must be able to find the factors for 2080046 in less than 200000 nano-seconds. (ms/1000000).
     * <p>
     * LEVEL: DIFFICULT
     *
     * @param num The number to be factored
     * @return An Integer ArrayList of factors of num.
     */
    public static ArrayList<Integer> factorial(int num) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }


}