//import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class MorningWarmups {
    public static void main(String[] args) {

//        System.out.println(noAsterisk(100, 5));
        consoleWrite();

    }

    // TODO Create your multiplication method without the * operator (Hint: a loop might be helpful).

/*    public static long noAsterisk(long num, long times) {
        long n = num;
        for (long i = 1; i < times; i++) {
            num += n;
        }
        return num;
    }*/

    // TODO Write a Java program to add two binary numbers.


/*    public static class addBinary {
        public static void main(String[] args) {
            long binary1, binary2;
            int i = 0, remainder = 0;
            int[] sum = new int[20];
            Scanner in = new Scanner(System.in);

            System.out.print("Input first binary number: ");
            binary1 = in.nextLong();
            System.out.print("Input second binary number: ");
            binary2 = in.nextLong();

            while (binary1 != 0 || binary2 != 0) {
                sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
                remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
                binary1 = binary1 / 10;
                binary2 = binary2 / 10;
            }
            if (remainder != 0) {
                sum[i++] = remainder;
            }
            --i;
            System.out.print("Sum of two binary numbers: ");
            while (i >= 0) {
                System.out.print(sum[i--]);
            }
            System.out.print("\n");
        }
    }*/

// todo Create a String[] with at least 6 String objects. Also create an empty ArrayList<String>. Then loop over the array and put the items into the ArrayList so that we have the same contents

//    String[] fruits = {"banana", "orange", "apple", "grape", "mango", "melon"};
//    ArrayList<String> arr = new ArrayList<>();

    // TODO write a java program that reads in a series of 3-5 lines and then writes them out to the console

    public static void consoleWrite() {
        String[] data = {"Hello, my name is Yasmin",
                "I am trying to write in a console.",
                "Today is Monday.",
                "The weather will change in the afternoon.",
                "Stack Overflow is my best friend"};
        for (String s : data) {
            System.out.println(s);
        }
    }
}