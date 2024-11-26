package tests;

import java.util.Scanner;

public class Aufgabe5b {

	public static void main(String[] args) {
		
		Aufgabe_5b();

	}

	public static void Aufgabe_5b() {
		
		Scanner sc_IND_mult = new Scanner(System.in);
			String firstNumberPair, secondNumberPair;
		
			System.out.print("Zahl 1 = ");
			firstNumberPair = sc_IND_mult.nextLine();
			System.out.print("Zahl 2 = ");
			secondNumberPair = sc_IND_mult.nextLine();
			
			System.out.println("\n" + firstNumberPair + " * " + secondNumberPair);
			System.out.println("--------");
			
		sc_IND_mult.close();

		
		int firstNumberT1, firstNumberT2, secondNumberT1, secondNumberT2;
		
		for (int i = 0; i < firstNumberPair.length(); i++) {
			char number = firstNumberPair.charAt(i);
			if (i == 0) {
			firstNumberT1 = Character.getNumericValue(number);	
			} else {
				firstNumberT2 = Character.getNumericValue(number);
			}
		}
		
		
		for (int i = 0; i < secondNumberPair.length(); i++) {
			char number = secondNumberPair.charAt(i);
			if (i == 0) {
			secondNumberT1 = Character.getNumericValue(number);		
			} else {
				secondNumberT2 = Character.getNumericValue(number);
			}
		}

//		System.out.print(firstNumberT1);
		
		
		
//		int calA1 = firstNumberT1 * secondNumberT1;
//		int calA2 = (firstNumberT1 * secondNumberT2) + (secondNumberT1 * firstNumberT2);
//		int calA3 = firstNumberT2 * secondNumberT2;
		

		
		
		
		
		
	}
	
}
