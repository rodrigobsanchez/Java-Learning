package ArrayListAndList;

import java.util.Scanner;

public class ArrayListPractice {
    static Scanner sc = new Scanner(System.in);
    static GroceryList gList = new GroceryList();
    public static void main(String[] args) {
        ArrayListPractice a = new ArrayListPractice();



        boolean quit = false;
        int choice = 0;
        a.printInstructions();
         while (!quit) {
             System.out.println("Enter your choice: ");
             choice = sc.nextInt();
             sc.nextLine();

             switch(choice){
                 case 0:
                     a.printInstructions();
                     break;
                 case 1:
                     gList.printGroceryList();
                     break;
                 case 2:
                     a.addItem();
                     break;
                 case 3:
                     a.modifyItem();
                     break;
                 case 4:
                     a.removeItem();
                     break;
                 case 5:
                     a.searchForItem();
                     break;
                 case 6:
                     quit = true;
                     System.out.println("App ended.");
                     break;
                 default:
                     //a.printInstructions();
                     break;

             }
         }

    }

    private void printInstructions(){
        System.out.println("\n Press: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search fpr an item in the list.");
        System.out.println("\t 6 - To quit the application \n");
    }

    private void addItem(){
        System.out.print("Please enter the grocery item: ");
       gList.addGroceryItem(sc.nextLine());
    }

    private void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter replacemente item: ");
        String newItem = sc.nextLine();
        gList.modifyMarketList(itemNum -1, newItem);

    }
    private void removeItem(){
        System.out.print("Enter an item number: ");
        int n = sc.nextInt();
        sc.nextLine();
        gList.removeItem(n);

    }

    private void searchForItem(){
        System.out.print("Item to search for: ");
        String s = sc.nextLine();

        if(gList.findItem(s) != null){
            System.out.println("Found " + s + " in our shopping list");
        } else {
            System.out.println(s + " is not in the shopping list.");
        }
    }


}


