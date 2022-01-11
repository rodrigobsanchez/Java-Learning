package HeadFirstSomeOfIt;

import java.util.*;
import java.io.*;

public class DotCom {
	
	private ArrayList<String> locaCells;
	private int nHits;
	private String name;
	
	  DotCom(String n){
		  
		  this.name = n;
	  }
	

	public String checkOut(String userInput) {
		
		String result = "miss";
		
		// MUITO MELHOR!! Find out if the user guess is in the AList by asking for its index... if it`s not it will return the value -1;
		int index = locaCells.indexOf(userInput);
		
		if(index >= 0) {
			locaCells.remove(index);
			
			if(locaCells.isEmpty()) {
				result = "kill";
				System.out.println("Ouch! You sunk " + name + "  : ( ");
			}
			else {result = "hit";}
		}
		return result;
	}
	
	
	// GETTERS AND SETTERS 
	public ArrayList<String> getLocaCells() {
		return locaCells;
	}
	public void setLocaCells(ArrayList<String> locaCells) {
		this.locaCells = locaCells;
	}
	public int getnHits() {
		return nHits;
	}
	public void setnHits(int nHits) {
		this.nHits = nHits;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

  
      
}
