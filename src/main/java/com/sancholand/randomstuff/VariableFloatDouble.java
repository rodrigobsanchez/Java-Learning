package com.sancholand.randomstuff;
import java.math.BigDecimal;
import java.util.*;

public class VariableFloatDouble {

	
	public static void main(String[] args) {
	int myIntValue = 5;
	
	//Attention for dividing a Integer...
	// result will be 2; rounding down the actual result (2.5). Because we are not using any remainder ( myIntValue %2).
	myIntValue = myIntValue/2;
	
	
	// pode colocar sem o `f`, agora se quiser colocar um numero decimal tipo float eh necessario colocar o F.
	float myFloatValue = 5f;
	//only has 7 digits of precision.
	myFloatValue = myFloatValue / 3f; // = 1.6666666
	
	
	//no need to add the `d` because java will assume is a double when decimals.
	double myDoubleValue = 5.0;
	// double have 16 digits of precision.
	myDoubleValue = myDoubleValue / 3d;   // = 1.6666666666666667
	
	// will make an auto double --> `float newFloatValue = 5.4;` so you should make. // the `f` is easier.
	float newFloatValue = (float )5.4;
	
	System.out.println(myIntValue);
	System.out.println(myFloatValue);
	System.out.println(myDoubleValue);
	System.out.println();
	
	double pounds = 200;
	
	double kilos = pounds *0.45359237;
	
	System.out.println(kilos);
	
	long bibi = Long.MAX_VALUE;

	System.out.println(bibi);
}
}
	
