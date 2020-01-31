public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello ");
//        System.out.print("World!");

        // TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

//        int myFavoriteNumber;
//        myFavoriteNumber = 5;
//        System.out.println(myFavoriteNumber);

        //TODO Create a String variable named myString and assign a string value to it, then print the variable out to the console.

//        String myString;
//        myString = "Yasmin";
//        System.out.println(myString);

        //TODO:Change your code to assign a character value to myString. What do you notice?

//        char myString;
//        myString = 'Yasmin';
//        System.out.println(myString);

        //TODO Change your code to assign the value 3.14159 to myString. What happens?

//        String myString = 3.14159;
//        System.out.println(myString);

        //TODO Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

//        long myNumber;
//        System.out.println(myNumber);

        // TODO Change your code to assign the value 3.14 to myNumber. What do you notice?

//        long myNumber = 3.14;
//        System.out.println(myNumber);

        // TODO Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//        long myNumber = 123L;
//        System.out.println(myNumber);

        // TODO Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

//        long myNumber = 123;
//        System.out.println(myNumber);

        // TODO Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//        float myNumber = 3.14;
//        System.out.println(myNumber);

        // TODO Copy and paste the following code blocks one at a time and execute them. What is the difference between the above code blocks? Explain why the code outputs what it does.

//        int x = 5;
//        System.out.println(x++); // 5
//        System.out.println(x); // 6

//        int x = 5;
//        System.out.println(++x); //6
//        System.out.println(x); //6

        // TODO Try to create a variable named class. What happens?

//        long class; // doesn't allow the word "class"

        // TODO Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run? Copy and paste the code above and then run it. Does the result match with your expectation?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        System.out.println(three); // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap') at HelloWorld.main(HelloWorld.java:69)

        // TODO How is the above example different from the code block below?

//        int three = (int) "three";
//        System.out.println(three); // String cannot be converted in int

        //TODO Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;
//        System.out.println(x);
// // shorthand
//        int x = 4;
//        x += 5;
//        System.out.println(x);


//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y);
// // shorthand
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        System.out.println(y);
// // shorthand
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(y);

        // TODO What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?


        Car tesla = new Car("tesla", "model s", 2019);
        System.out.println(tesla);
    }
}
