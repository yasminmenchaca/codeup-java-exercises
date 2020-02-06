package grades;

import java.util.ArrayList;

public class Student {
    // TODO It should have private properties for the student's name, and grades.
    private String name;
    private ArrayList<Integer> grades;

    // TODO The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

//https://stackoverflow.com/questions/54725171/arraylist-integer-calculate-average-grade-without-considering-extreme-values/54725262

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    // TODO Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
    public static void main(String[] args) {
        ArrayList<Integer> studentGrades = new ArrayList<>();
        studentGrades.add(81);
        studentGrades.add(95);
        studentGrades.add(73);
        Student student = new Student("Yasmin", studentGrades);
        System.out.format("Student: %s", student.getName());
        System.out.format("\nAverage: %s", student.getGradeAverage());
        student.addGrade(78);
        System.out.format("\nNew Average is %s", student.getGradeAverage());
    }
}