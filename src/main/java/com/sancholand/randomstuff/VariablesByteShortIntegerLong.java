package com.sancholand.randomstuff;
import java.util.*;
public class VariablesByteShortIntegerLong {

	public static void main(String[] args) {

     int myValue = 10000;
     
	byte myByteValue = -128;	
	
	// casting necessary cuz java will make newValue into a Integer if its inside ( )....
	//Example...
	byte newValue = myByteValue;
	byte newValue2 = (byte) (myByteValue/2);
	// If don`t specify Java will automatic make the variable into a Integer if yu put it insise "( )".
		myValue = (myByteValue/2);
		
		
		
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		//don`t need casting because an integer fits perfectly into a long;
		long longValue = 50000 + 10 * (byteValue + shortValue + intValue);
		// everything is inside  ( )... will be a integer if you don`t CAST.
		short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
		System.out.println(longValue);
		System.out.println(shortTotal);
		
		
		System.out.println();
		
	}

}
