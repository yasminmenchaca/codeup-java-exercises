import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Have a conversation with Bob!");
        String bob;
        boolean goodBye;

        do {
            bob = sc.nextLine();
            goodBye = (!bob.equalsIgnoreCase("Bye"));
            if (bob.endsWith("?")) {
                System.out.println("Sure");
            } else if (bob.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (bob == null) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

        } while (goodBye);
    }
}
