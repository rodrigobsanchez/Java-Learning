package AutoBoxingAndUnboxing;

import java.util.ArrayList;

public class Main {

    /*
    AUTOBOXING --> When we convert an base primitive int into an Wrapper Class Integer
            "Interger.valueOf(int number)"
     */
    /*
    UNBOXING --> we're taking it from the class or from the object wrapper and converting back to a primitive type
            "Interger.valueOf(10).intValue() //return value of the int"
     */

    /*
     ArrayList<Integer>  intClassArrList = new ArrayList<Integer>();

        intClassArrList.add(Integer.valueOf(10)); // AUTOBOXING
        System.out.println("Unboxing --> " + intClassArrList.get(0).intValue()); // UNBOXING
     */

    public static void main(String[] args) {

       Bank bank = new Bank("national Australia Bank");

       bank.addBranch("1stBranch");

        bank.addCustomer("1stBranch", "Client1", 50.05);
        bank.addCustomerTransaction("1stBranch", "Client1", 50555.0);
        bank.addCustomerTransaction("1stBranch", "Client1", -5333.0);
        bank.addCustomer("1stBranch", "client2", 1123);
        bank.addCustomer("1stBranch","Cluen3", 111.22);
        bank.addCustomerTransaction("1stBranch", "Cluen3", -211.22d);

        bank.addBranch("2ndBranch");
        bank.addCustomer("2ndBranch", "Bob", 150.54);

        bank.addCustomerTransaction("1stBranch", "Client1", 44.22);
        bank.addCustomerTransaction("1stBranch", "Client1", 44.38);
        bank.addCustomerTransaction("1stBranch", "Client1", 455);
        bank.addCustomerTransaction("2ndBranch", "Bob", 442222.22);
        bank.addCustomerTransaction("2ndBranch", "Bob", -30000);

        bank.listCustomers("1stBranch", true);
        bank.listCustomers("2ndBranch", true);
    }
}
