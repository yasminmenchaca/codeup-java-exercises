package movies;

import util.Input;

public class MoviesApplication {
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        Input scan = new Input();
        boolean yesNo; // moves to next row
        do {
            System.out.println("\nWelcome to Blockbuster\n" +
                    "==========================================\n" +
                    ("0 - exit\n" +
                            "1 - view all movies\n" +
                            "2 - view movies in the animated category\n" +
                            "3 - view movies in the drama category\n" +
                            "4 - view movies in the horror category\n" +
                            "5 - view movies in the sci fi category\n") +
                    "==========================================");
            int input = scan.getInt(0, 5); // asks to input number 0-5
            switch (input) {
                case 0:
                    System.out.println("Goodbye");
                    break;
                case 1:

                    // https://www.w3schools.com/java/java_for_loop.asp
                    // for (type variableName : arrayName)

                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.format("%s -- %S\n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.format("%s -- %S\n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.format("%s -- %S\n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.format("%s -- %S\n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.format("%s -- %S\n", movie.getName(), movie.getCategory());
                        }
                    }
                    break;
                default:
                    break;
            }
            System.out.println("\nWould you like to continue?");
            yesNo = scan.yesNo();
        } while (yesNo);
    }
}