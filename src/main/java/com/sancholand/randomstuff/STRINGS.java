package com.sancholand.randomstuff;

public class STRINGS {

	public static void main(String[] args) {

		String s = "This is a String.";
     
		System.out.println(s);
		// concatenacao adicionando mais coisas ao String ou a variavel em si.
		s = s + "VAMOS GREMIO COPEIRO";
		
		System.out.println(s);
		
		String lastString = "10";
		int temp = 50;
		
		// result would be '1050'
		lastString = lastString + temp;
		
		System.out.println(lastString);
	}

}
