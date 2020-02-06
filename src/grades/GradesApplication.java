package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

// TODO Inside the main method, create a HashMap named students. It should have keys that are strings that represent github students, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        boolean userAnswer;

        Student larry = new Student("Larry");
        larry.addGrade(77);
        larry.addGrade(93);
        larry.addGrade(89);
        students.put("gordo_91", larry);

        Student adam = new Student("Adam");
        adam.addGrade(75);
        adam.addGrade(91);
        adam.addGrade(71);
        students.put("adam.sanchez", adam);

        Student yasmin = new Student("Yasmin");
        yasmin.addGrade(80);
        yasmin.addGrade(74);
        yasmin.addGrade(80);
        students.put("yasminismean", yasmin);

        Student ismael = new Student("Ismael");
        ismael.addGrade(91);
        ismael.addGrade(74);
        ismael.addGrade(81);
        students.put("chemical_blaze", ismael);

        // TODO Create the command line interface


    }
}