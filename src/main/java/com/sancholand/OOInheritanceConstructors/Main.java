package OOInheritanceConstructors;

public class Main {

    public static void main(String[] args) {

        Account a = new Account("12345", 0.00, "Bob Brown", "neymar@gmail.com", "5132227092");
        a.deposit(1000);
        a.withdrawal(37.65);

       // System.out.println(a.accDescription());


        /*
            ATTENTION -> At line 21... create a polymorphism Animal GermanSheperd... but CANNOT override bark because Animal doesn`t have bark method
        and at line 25 it is possible cuz both dog and shepard have the bark method.. if it has the bark method the OVERRIDDEN will happen

        ****IMPORTANTE RULE ABOUT INHERITANCE --> Both classes must have the method to be overridden.
                    Always in two classes that have a CHILD-PARENT or IS-A relationship.
         */

        Animal d = new GermanSheperd("MyDog", 1, 1,15,23,"El ordenador de ovelhas");
        Animal d2 = new Dog("Mister", 1, 1,11,22);
        d.bark();
        d2.bark();
        Dog d3 = new Dog("Misterio", 1, 1,11,19);
        d3.bark();
        Dog d4 = new GermanSheperd("MyDog2", 1, 1,14,23,"El ordenador de ovelhas");
        d3.barkAnimal(); // Method made to call super.bark()
        /*
        OVERLOADING method bark(int n) by changing its parameters!!!
           ** May have different return types and different access modifiers.
           ** MUST have different parameters.
           ** Usually in a single class but usable with a child class (can use with germanShepherd class)
         */
        d3.bark(4);
        // *** d2.barkAnimal() doesn't even exist.. because there is no methos with that name in Animal class...
        System.out.println();

        System.out.println(d.toString() + " \n" +
                           d2.toString() + " \n" +
                           d3.toString() + " \n" +
                           d4.toString());

        d2.showAll();
    }

    public static void printAll(){
        System.out.println("Static METHOD HERE!!!!!");
    }


}
