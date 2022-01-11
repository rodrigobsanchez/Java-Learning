package com.sancholand.randomstuff;
import java.util.*;
import HeadFirstSomeOfIt.DotCom;

public class KeywordsandCodeBlocks {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		
		// the braces ('{')on the if is a CODE BLOCK is OPTIONAL if you have only one statement to make on the logical if test
		// *** IMPORTANT: if a statement is immediatly after the if test or in the next line you dont need the '{}'
		if(score == 5001) // or -> if(score == 5000) System.out.println("your score is 5000"); -> it is ok
			
			System.out.println("your score is 5000");
		
		
		System.out.println("yeeeey");
		
		// && = logical operator 'e' -> to work both expression must be true 
		if(score < 5000 && score > 1000) {
			System.out.println("score was less than 5k but greater than 1k");
		}
		// if there were more 'else if`s' once one og them is true it will ignore the other else if
		else if (score < 1000) {
           System.out.println("...less than 1k");			
		}
		
		// if none os the previous test return true 'else' will be the one the program will execute.
		else {
			System.out.println("got in else");
		}
		
		// in here because the variable has the value 'true' the if statement = to if(gameOver == true).
		if (gameOver) {
			int finalScore = score + (levelCompleted * 5);
			System.out.println("Your final score:" + finalScore);
		}
		int[] i = new int[2];
		 int hah = i.length;
		  
			   System.out.println(hah);
		   // this one will return TRUE on both.
			   String u = "miss";
			   String test = "miss";
			   //TRUE
			   System.out.println(u == test);
			   //TRUE
			   System.out.println(u.equals(test));
			   
			   String s1 = new String("HELLO"); 
		        String s2 = new String("HELLO"); 
		        
		        // this will return FALSE... btw in sys.out we are testing the expression s1 == s2...
		        System.out.println(s1 == s2);
		        // return TRUE.
		        System.out.println(s1.equals(s2)); 
		        
		        
		        
			  // if(u == test) {
				//   System.out.println(" compare two Strings with '=='??");
				   
			  // }
			  // if (u.equals(test)) { System.out.println("comparing with .equals method"); }
			 //  else { System.out.println("dont work with ");}
			  // 
			  // if(u == "miss") {
				//   System.out.println(" compare two Strings with '=='??");
				//   
			  // }
			  // if (test.equals("miss")) { System.out.println("comparing with .equals method"); }
			  // else { System.out.println("dont work with ");}
			   
			   
			  
	          
		        int num1 = 10;
		        int num2 =  10;
		        // will return true...
		        System.out.println(num1 == num2); 
		       
		        // .equal is a methos for comparing strings....
		        //System.out.println(num1.equals(num2)); 
		        
		        Thread t1 = new Thread(); 
		        Thread t2 = new Thread(); 
		        Thread t3 = t1; 
		  
		        String s3 = new String("GEEKS"); 
		        String s4 = new String("GEEKS"); 
		        //True
		        System.out.println(t1 == t3);
		        //False
		        System.out.println(t1 == t2); 
		        // False
		        System.out.println(t1.equals(t2)); 
		        //True
		        System.out.println(s3.equals(s4)); 
		        
		        
		        int x = 5;
		        int y = 10;
		        // z = 60; First x is incremented.. because the '++' is before the variable itself. If it was after result would be 50!!! 
		        // Then multiply will go on --> x = (1+5) * y(10)--          '--' will be ignored.... RESULT -> 60 
		        int z = ++x * y--;
		        System.out.println(z);

		        System.out.println("1 + 2 = " + 1 + 2); // Output = 1 + 2 = 12
		        System.out.println("1 + 2 = " + (1 + 2)); // Output = 1 + 2 = 3    -> because of '()'
		        double d = Math.random()* 10;
		        int random = (int) d;
		        System.out.println(random);
		        
	}

}
