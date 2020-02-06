package groceries;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceriesApplication {

    ArrayList<Groceries> list = new ArrayList<Groceries>();

    //Add a new Groceries to the list
    public void addItem() {
        System.out.println();
        System.out.println("enter in the name of your item");
        Scanner keyboard = new Scanner(System.in);
        String ItemName = keyboard.nextLine();

        System.out.println("enter in the price of your item");
        double ItemPrice = keyboard.nextDouble();

        System.out.println("enter in the Qty of your item");
        int ItemQty = keyboard.nextInt();

        Groceries Item = new Groceries(ItemName, ItemPrice,
                ItemQty);
        list.add(Item);
        System.out.println("Item Added");
    }

    //Display list and total number of items.
    public void displayItem() {
        System.out.println(list.size() + " items. ");
        for (Groceries x : list) {
            System.out.println(x.toString());
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroceriesApplication myList = new GroceriesApplication();
        int userOpt = 0;
        while (userOpt != 3) {
            System.out.println("");
            System.out.println("----- Shopping List------");
            System.out.println("(1) Add an item to the list. ");
            System.out.println("(2) Display list and total number of items. ");
            System.out.println("(3) Exit. ");
            userOpt = input.nextInt();

            if (userOpt == 1) {
                myList.addItem();

            }

            if (userOpt == 2) {
                myList.displayItem();
            }
        }
    }
}