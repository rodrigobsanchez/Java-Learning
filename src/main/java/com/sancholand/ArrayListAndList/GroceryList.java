package ArrayListAndList;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {

    private List<String> marketList = new ArrayList<String>();

    public void printGroceryList(){
        System.out.println("You have "+ marketList.size() + " item in you grocery list.");
        for(int i = 0; i < marketList.size(); i++){
            System.out.println((i+1) + ". " + marketList.get(i));
        }
    }

    public void modifyMarketList(int position, String newItem){
        marketList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeItem(int position){
        String theItem = marketList.get(position-1);
        System.out.println("The item " + theItem + " was successfully removed.");
        marketList.remove(position-1);
    }

    public String findItem(String item){
        boolean exist = marketList.contains(item);
        if(exist){
            System.out.println("Item " + item + " was found.");
            return item;
        } else {
            System.out.println("Item was not found in the current grocery list");
            return null;
        }
    }

    public void addGroceryItem(String s){
        marketList.add(s);
    }

    public List<String> getMarketList() {
        return marketList;
    }
}
