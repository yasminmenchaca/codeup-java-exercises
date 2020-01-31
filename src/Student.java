import java.util.Date;

public class Student {
    static int numberOfStudents = 0;
    String name;
    String cohort;
    Date startDate;
    String program;
    String location;
    Boolean drinksCoffee;

    public static void main(String[] args) {
        Student daniel = new Student("Daniel");
//        daniel.name = "Daniel";
        daniel.cohort = "Europa";
        daniel.startDate = new Date("11/04/2019");
        daniel.program = "Web Development";
        daniel.location = "Dallas";
        daniel.drinksCoffee = true;


        Student zach = new Student("Zach");
//        zach.name = "Zach";
        zach.cohort = "Bayes";
        zach.startDate = new Date("Feb 11, 2017");
        zach.program = "Data Science";
        zach.location = "San Antonio";
        zach.drinksCoffee = false;


        System.out.println(daniel.report());
        System.out.println(zach.report());
        System.out.printf("There are now %d students.", numberOfStudents);


//        if (zach.drinksCoffee)
//            System.out.println(zach.name + "drinks coffee.");


    }

    public Student(String name) {
        this.name = name;
        numberOfStudents++;
    }

    public String report() {
        String output = "";
        output += "My name is " + this.name + ".";
        output += "\nI started learning " + this.program + " with " + this.cohort + " on " + this.startDate + ".";
        if (this.drinksCoffee)
            output += "\nI drink coffee in " + this.location + ".";
        else
            output += "\nI don't drink coffee in " + this.location + ".";
        return output;

    }
}
