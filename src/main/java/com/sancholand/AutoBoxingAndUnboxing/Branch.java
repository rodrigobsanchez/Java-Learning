package AutoBoxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private String name;
    private List<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double amount){
        if(findCustomer(customerName)== null){
             this.customers.add(new Customer(customerName,amount));
             return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customer, double amount){
        Customer existingCustomer = findCustomer(customer);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for(Customer c : customers){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }


}
