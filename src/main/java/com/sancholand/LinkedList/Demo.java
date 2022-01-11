package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        Demo demo = new Demo();

        placesToVisit.add("Sydney");
        placesToVisit.add("Melborne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Camberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        placesToVisit.add("Sydney");


        placesToVisit.add(1, "Alice Springs");
        /*
        After this line 'Sydney' will point to 'Springs' and this one will point to 'Melbourne'
         */

        // remove index 4...
        placesToVisit.remove(4);
        demo.printList(placesToVisit);
        LinkedList<String> sortedList = new LinkedList<String>();
        for(String s : placesToVisit){
            demo.addInOrder(sortedList, s);
        }
        demo.printList(sortedList);


    }

    private void printList(LinkedList<String> linkedList){

        // Iterator... to iterate with collections..
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("ENNNNNNNNNNNNNNNNNNDIIIINNGGG");

    }

    //Method to force an alphabetical order to the linkedlist.
   private boolean addInOrder(LinkedList<String> list ,String newCity){

        //ListIterator is good to iterate with linkedLists...
       ListIterator<String> stringListIterator = list.listIterator();

       while(stringListIterator.hasNext()){
           /*
            .compareTo ...compared lexicographically (Alphabetically order) two Strings.. return a integer// 0 when are equal..
             positive when 2nd string should go before the 1st..
             and negative if the 2nd suppose to be after the 1st.
            */

           int comparison = stringListIterator.next().compareTo(newCity);
           if(comparison == 0){
               //equal, do not add.
               System.out.println(newCity + " is already included as a destination");
               return false;
           } else if (comparison > 0){
               // new city should apear before this one
               //Brisbane --> Adelaide
               stringListIterator.previous();
               stringListIterator.add(newCity);
               return true;
           } else if (comparison < 0){
               //move on next city
           }

       }

       stringListIterator.add(newCity); //adding at the end of the LinkedList.
       return true;
   }

}
