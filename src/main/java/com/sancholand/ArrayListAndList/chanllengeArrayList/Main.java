package ArrayListAndList.chanllengeArrayList;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone("997704181");

    public static void main(String[] args) {
      Main app = new Main();

        boolean quit = false;
        app.startPhone();
        app.printActions();

        while(!quit){
            System.out.println("\nEnter action: (6 available actions)");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){
                case 0:
                    System.out.println("Shutting it down..");
                    quit = true;
                    break;
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    app.addnewContact();
                    break;
                case 3:
                    app.updateContact();
                    break;
                case 4:
                    app.removeContact();
                    break;
                case 5:
                    app.queryContact();
                    break;
                case 6:
                    app.printActions();
                    break;
            }
        }

    }

    private void startPhone(){
        System.out.println("Starting your phone...");
    }

    private void printActions(){
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a list of avaible actions.");
        System.out.println("Choose your action: ");
    }

    private void addnewContact(){
        System.out.println("Enter new contact name:");
        String n = sc.nextLine();
        System.out.println("Enter mobile number:");
        String number = sc.nextLine();
        Contact c = new Contact(n, number);
        //addContact returns a boolean...
        if(mobile.addContact(c)){
            System.out.println("New Contact was added \n" + c.toString());
       } else {
            System.out.println("Cannot add an existing contact to the list");
        }

    }
    private void updateContact(){

        mobile.printContacts();
        System.out.println("Enter existing contact name: ");
        String temp = sc.nextLine();

        Contact updatedContact = mobile.queryContact(temp);
        if(updatedContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = sc.nextLine();
        System.out.println("Enter new phone number ");
        String newNumber = sc.nextLine();
        Contact newContact =  new Contact(newName, newNumber);

        //Method returns a boolean
       if(mobile.updateContact(updatedContact, newContact)){
           System.out.println("Contact was successfully updated");
       } else {
           System.out.println("Error updating the contact");
       }
    }

    private void removeContact(){

        mobile.printContacts();
        System.out.println("Enter existing contact name: ");
        String name = sc.nextLine();

        Contact c = mobile.queryContact(name);
        if(c == null){
            System.out.println("Contact not found");
            return;
        }

        if(mobile.removeContact(c)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = sc.nextLine();

        Contact c = mobile.queryContact(name);
        if(c == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println(c.toString());
    }

}
