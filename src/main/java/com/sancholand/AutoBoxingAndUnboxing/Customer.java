package AutoBoxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Double> transactions;
    private Double amount;


    public Customer(String name, double firstTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        transactions.add(firstTransaction);
        this.amount = 0.0;
    }

    public void addTransaction(double amount){

        transactions.add(amount);
    }

    public String getName() {

        return name;
    }

    public List<Double> getTransactions()
    {
        return transactions;
    }

    public String showTransactions(List<Double> list){
        String n = "";
        for( int i = 0 ; i < list.size(); i++) {
            n += " " + list.get(i).toString() +" \n";
        }
        return n;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Customer: " + name + "\n Amount = " + getAmount() + " Reais." +"\n Transactions:  \n" + showTransactions(getTransactions());
    }
}
