package grades;

import java.util.HashMap;

// TODO Inside the main method, create a HashMap named students. It should have keys that are strings that represent github students, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();
        students.put("Ryan", "ryanorsinger");

        System.out.println(students); // {Ryan=ryanorsinger}

        students.putIfAbsent("Zach", "zgulde");
        students.putIfAbsent("Zach", "coderdude24");
        System.out.println(students); // {Ryan=ryanorsinger, Zach=zgulde}

        students.remove("Zach");
        System.out.println(students); // {Ryan=ryanorsinger}

        students.replace("Ryan", "torvalds");
        System.out.println(students); // {Ryan=torvalds}

        students.clear();
        students.isEmpty(); // true
    }
}