package HeadFirstSomeOfIt;

import java.io.*;
import java.util.*;


public class GameHelper {
	
	// REMEMBER -> The Grid count is: A1,A2,A3,A4,A5,A6,A7,B1,B2 (...) so it is counted vertically.
	
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	//grid size is 7 x 7 = 49
	private int gridSize = 49;
	private int [] grid = new int[gridSize];
	private int comCount = 0;
	
	
	


	public String getUserInput(String s) {;
		String inputLine = null;
		
		System.out.println(s + " ");
		try {
			
			//read text from use input...
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			
			if(inputLine.length() == 0)  return null;
			
		} catch (IOException e) {
			
			System.out.println("IOException: " + e);
		}
		
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String> placeDotCom (int comSize){
		
		ArrayList<String> alphaCells = new ArrayList<String>();
		
		String temp = null;
		int [] coords = new int[comSize];
		int attempts = 0;
		boolean success = false;
		int location = 0;
		
		comCount++;
		//set horizontal increment because the count of cells is done vertically.... dotCOms will be added like this: 1st horizontal, 2nd Vertical, 3nd horizontal and so On.
		int increment = 1;
		if((comCount % 2) == 1) {
			// increment will be 7...
			increment = gridLength;
		}
		
		// using only one ' & ' because we want the JVM to use de '++' of attempts, with '&&' he would ignore the second statement with the 1st being true. ENQUANTO success for false e attempts for menor 200.
		while(!success & attempts++ < 200) {
			//get random starting point.
			location = (int) (Math.random()* gridSize);
			
			int x = 0;
			success = true;
			
			// while success is true keep going..
			  while(success && x < comSize) {
				  
				  if(grid[location] == 0) {
					  
					  // adding locations to the array the '++' will increment only after the coords[0] = location.
					  coords[x++] = location;
					  location += increment; // location = location + increment. This line means "Try next 
					  
					  if(location >= gridSize) {
						  success = false;
					  }
					  //  location is divisible with gridLenth... e x > 0.. // OUT OF BOUNDS right edge of the grid.
					  if (x > 0 && (location % gridLength == 0)) {
						  success = false;
					  }
				  }
				  
				// found already used location....
				  else { success = false;}
			  }
		}
		
		// x = 0 to the loop.
		int x = 0; 
		int row = 0;
		int column = 0;
		
		//FOR TESTING REMOVE LATER
		System.out.println("\n");
		
		while(x < comSize) {
			
			//value 1 means the location cell is now taken.
			grid[coords[x]] = 1;
			// get a row value if 29/7 = 3 and remainder is 1
			row = (int) (coords[x] / gridLength);
			//get numeric column value. that is the remainder...  Column = remainder.
			column = coords[x] % gridLength;
			
			// convert the column value to the String temp... alphabet is a instance variable String - chars "abcdefg"
			temp = String.valueOf(alphabet.charAt(column));
			
			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
			//TESTING REMOVE LATER
			System.out.println("  coord " +x+ " = " + alphaCells.get(x-1));
		}
		
		//FOR TESTING REMOVE LATER
				System.out.println("\n");
		return alphaCells;
	}
	
	//Getters And Setters
	public int getGridLength() {
		return gridLength;
	}


	public void setGridLength(int gridLength) {
		this.gridLength = gridLength;
	}


	public int getGridSize() {
		return gridSize;
	}


	public void setGridSize(int gridSize) {
		this.gridSize = gridSize;
	}


	public int[] getGrid() {
		return grid;
	}


	public void setGrid(int[] grid) {
		this.grid = grid;
	}


	public int getComCount() {
		return comCount;
	}


	public void setComCount(int comCOunt) {
		this.comCount = comCOunt;
	}
}