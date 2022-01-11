package ArrayListAndList.chanllengeArrayList;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

   public Contact createContact(String name, String number){
        return new Contact(name,number);
   }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s \nPhone Number: %s" , this.name,this.phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
