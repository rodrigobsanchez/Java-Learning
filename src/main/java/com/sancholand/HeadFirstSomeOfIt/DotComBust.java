package HeadFirstSomeOfIt;

import java.util.*;
import java.io.*;

public class DotComBust {
	
	// **** POSSIBLE to Declare this as private..
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> DotComList = new ArrayList<DotCom>();
	private int numberOfGuesses = 0;
	
	private void setUpGame() {
		 int position = 0;
		 // creating objects of to go into the list of objects... i believe later on we will make the use choose the number of 'ships' he wanna play
		 DotCom one = new DotCom("Pets.com");
		 DotCom two = new DotCom("eToys.com");
		 DotCom three = new DotCom("Go2.com");
		 
		 // adding them up...
		 DotComList.add(one);
		 DotComList.add(two);
		 DotComList.add(three);
		 
		 System.out.print("Your goal is to sink three dot coms named: ");
		 System.out.println(one.getName() + " "+ two.getName()+ " "+ three.getName());
		 
		 System.out.println("Try to sink them all in the fewest number of guesses");
		 
		 // for-each to iterate with all arrayList of DOTCOMS.
		 for (DotCom dc : DotComList) {
			 //the 3 means the length of the array.... the dot COms have 3 cells.
			 ArrayList<String> newLocations = helper.placeDotCom(3);
			 dc.setLocaCells(newLocations);
		  }
		 	 	
	  }

	private void startPlaying() {
 		
 		// .isEmpty will return true if the list has no elements... here we are making a loop, and by '!' meaning: 'While isEmpty == false' keep going...
		// when isEmpty becomes true loop will end. or "AS LONG AS OUR LIST IS NOT EMPTY"
 		while(!DotComList.isEmpty()) {
 			String userGuess = helper.getUserInput("Enter a guess");
 			
 			checkUserGuess(userGuess);
 		}
 		 finishGame();
 	}
	
	private void checkUserGuess (String guess) {
		 numberOfGuesses++;
		 String result = "miss";
		 
		 for(DotCom dc : DotComList) {
			 result = dc.checkOut(guess);
			 
			 if(result.equals("hit")) {
				 break;
			 }
			 if(result.equals("kill")) {
				 //removing the current object from the list
				 DotComList.remove(dc);
				 break;
			 }
		 }
		 System.out.println(result);
		
	}
	
	private void finishGame() {
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		
		if(numberOfGuesses <= 18) {
			System.out.println("It only took you " + numberOfGuesses + " guesses.");
			System.out.println("You got out before your option sank.");
		}
		else {
			System.out.println("Took you long enough. "+ numberOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your optiuons");
		}	
	}
	
	public static void main(String[] args) {
		
		DotComBust dbc = new DotComBust();
		dbc.setUpGame();
		dbc.startPlaying();
		

	}
	
	


	public int getNumberOfGuesses() {
		return numberOfGuesses;
	}

	public void setNumberOfGuesses(int numberOfGuesses) {
		this.numberOfGuesses = numberOfGuesses;
	}


}
