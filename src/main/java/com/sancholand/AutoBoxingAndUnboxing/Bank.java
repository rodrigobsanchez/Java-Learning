package AutoBoxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Bank {


    private String name;
    private List<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch (String branchName){
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch b = findBranch(branchName);
        if(b != null){
            return b.newCustomer(customerName, initialAmount);
        }
        return false;
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch b = findBranch(branchName);
        if(b != null){
            return b.addCustomerTransaction(customerName, amount);
        }
        return false;
    }


    public boolean listCustomers (String branchName, boolean showTransactions){
        Branch b = findBranch(branchName);
        double amount = 0;
        if(b != null){
            System.out.println("Customers detail for branch " + b.getName());

            List<Customer> branchCustomers = b.getCustomers();

            for(Customer c : branchCustomers){
                if(showTransactions){
                    List<Double> transactions = c.getTransactions();
                    for(Double temp : transactions){
                        amount += temp;
                    }
                    c.setAmount(amount);
                }
                System.out.println(c.toString());
                amount = 0;

            }
            return true;
        } else {
            return false;
        }
    }


    private Branch findBranch(String name){
        for(Branch temp : branches){
            if(temp.getName().equals(name)){
                return temp;
            }
        }
        return null;
    }



    public String getName() {
        return name;
    }

    public List<Branch> getBranches() {
        return branches;
    }

}
