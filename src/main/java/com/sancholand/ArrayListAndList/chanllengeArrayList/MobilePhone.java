package ArrayListAndList.chanllengeArrayList;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> contactList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }


    public boolean addContact(Contact c){
        //this version of the method returns an integer.
        if(findContact(c.getName()) >= 0){
            System.out.println("Contac is already on file");
            return false;
        }
       contactList.add(c);
        return true;
    }

    public boolean removeContact(Contact c){
        int foundPosition = findContact(c);
        if(foundPosition < 0) {
            System.out.println(c.getName() + " was not found.");
            return false;
        }
        this.contactList.remove(foundPosition);
        System.out.println(c.getName() + " was deleted.");
        return true;
    }


    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exist. Updadte not successfull");
            return false;
        }
        this.contactList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced by " + newContact.getName());
        return true;
    }

    private int findContact(Contact c){
        return this.contactList.indexOf(c);
    }

    private int findContact(String contactName){
        for(int i = 0; i < contactList.size(); i++){
            Contact contact = this.contactList.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact (Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.contactList.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List: ");
        for(Contact c : contactList){
            System.out.println(c.toString());
        }
    }
}
