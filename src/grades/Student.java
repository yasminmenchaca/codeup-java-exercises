package grades;

import java.util.ArrayList;

public class Student {
    // TODO It should have private properties for the student's name, and grades.
    private String name;
    private ArrayList<Integer> grades;

    // TODO The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
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
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // TODO Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
    public static void main(String[] args) {
        Student lynn = new Student("Lynn");
        lynn.addGrade(81);
        lynn.addGrade(95);
        lynn.addGrade(73);
        System.out.println("Student Name: " + lynn.getName());
        System.out.println("Student Avg: " + lynn.getGradeAverage());
        lynn.addGrade(100);
        System.out.println("New Avg: " + lynn.getGradeAverage());
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
}