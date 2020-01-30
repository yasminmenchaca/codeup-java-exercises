import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HighLow {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int numberOfTries, answer;
        Scanner userInput = new Scanner(System.in);
        String userGuess;
        boolean gameWin;

        do {
            answer = randomNumber.nextInt(100) + 1;
            gameWin = false;
            userGuess = null;
            numberOfTries = 0;

            while (!gameWin) {
                System.out.println("Guess a random number between 1 and 100 or type 'stop' to exit: ");
                userGuess = userInput.nextLine();
                numberOfTries++;


                if (userGuess.equals("stop"))
                    break;
                if (Integer.parseInt(userGuess) == answer) {
                    gameWin = true;
                } else if (Integer.parseInt(userGuess) < answer) {
                    System.out.println("Your guess is too low");
                } else if (Integer.parseInt(userGuess) > answer) {
                    System.out.println("Your guess is too high");
                }

            }

            if (userGuess.equals("quit")) {
                System.out.println("You choose to quit! Thanks for playing");
                System.out.println("The number was " + answer);
                System.exit(0);
            }
            System.out.println("The number was " + answer);
            System.out.println("It took you " + numberOfTries + " tries");
            System.out.println("You win! Play again(type: yes or no)");

            userGuess = userInput.nextLine();
        }
        while (userGuess.equals("yes"));

    }
}
