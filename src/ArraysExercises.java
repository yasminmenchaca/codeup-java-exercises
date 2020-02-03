import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        // TODO What happens when you run the following code? Why is Arrays.toString necessary?

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]

        // TODO Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        //  Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

//         intializing an array arr1
        String[] arr1 = {"Ismael", "Michael", "Adam"};

//         printing the array
        System.out.println("\nPrinting 1st array:");
        for (String value : arr1) {
            System.out.println(value);
        }

        // // or
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }

//         copying array arr1 to arr2 with new length as 4
        String[] arr2 = Arrays.copyOf(arr1, 4);
        arr2[3] = "Yasmin";

//         printing the array arr2
        System.out.println("\nPrinting new array:");
        for (String s : arr2) {
            System.out.println(s);
        }

        // // or
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }

    }
}