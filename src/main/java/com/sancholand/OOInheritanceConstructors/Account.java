package OOInheritanceConstructors;

public class Account {



    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNum;


    public Account(String n, double b, String cn, String email, String cell){

        this.number = n;
        this.balance = b;
        this.customerName = cn;
        this.customerEmailAddress = email;
        this.customerPhoneNum = cell;

    }

    public void withdrawal(double amount){
        double diff = 0;
        if(this.balance - amount < 0){
            diff = balance - amount;
            System.out.println(" Current Balance: " + this.balance + ". After the withdrawal you will be owning us: -" + diff);
        }else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " was made. Current Balance is --> " + this.balance);
        }
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit of " + amount + " $$. Balance is now --> " + this.balance);
    }

    public String accDescription(){
        String desc = "";
        // importante command String.format... how it works below.... ALSO '\n' means break line go to next line
        desc = String.format("Account number: %s, Customer Name: %s, Current Balance: %.2f,\nEmail: %s, Phone: %s."
                , this.number, this.customerName, this.balance, this.customerEmailAddress, this.customerPhoneNum );
        return desc;
    }


    // ********** GETTERS SETTERS *************
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNum() {
        return customerPhoneNum;
    }

    public void setCustomerPhoneNum(String customerPhoneNum) {
        this.customerPhoneNum = customerPhoneNum;
    }
}
