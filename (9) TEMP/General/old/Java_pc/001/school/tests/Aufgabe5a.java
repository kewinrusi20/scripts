package tests;

import java.util.Scanner;

public class Aufgabe5a {

	public static void main(String[] args) {
		
		Aufgabe_5b();

	}

	public static void Aufgabe_5b() {
		
		Scanner sc_IND_mult = new Scanner(System.in);
			int firstNumberPair, secondNumberPair;
		
			System.out.print("Zahl 1 & 2 = \t");
			firstNumberPair = sc_IND_mult.nextInt();
			secondNumberPair = sc_IND_mult.nextInt();
			
			System.out.println("\n" + firstNumberPair + " * " + secondNumberPair);
			System.out.println("--------");
			
		sc_IND_mult.close();
		
		
		String firstStringPair = Integer.toString(firstNumberPair);
		String secondStringPair = Integer.toString(secondNumberPair);		
		
		
		
	}
	
}
