package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Type anything: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Please enter yes or no.");
        String yesOrNo = scanner.nextLine();
        return yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        System.out.format("Choose number between %s and %s: \n", min, max);
        int userInput = Integer.parseInt(scanner.nextLine());
        if (userInput <= max && userInput >= min) {
            return userInput;
        } else {
            System.out.format("Invalid. Choose number between %s and %s: \n", min, max);
            return getInt(min, max);
        }

    }

    public int getInt() {
        System.out.println("Enter any number: ");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.format("Choose number between %s and %s: \n", min, max);
        double userDouble = scanner.nextDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        } else {
            System.out.format("Invalid. Choose number between %s and %s: \n", min, max);
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.println("Enter any number: ");
        return scanner.nextDouble();
    }
}
