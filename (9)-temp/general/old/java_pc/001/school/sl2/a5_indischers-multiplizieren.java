package SL2;

import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {

		Aufgabe_5();

	}

	public static void Aufgabe_5() {
		
		Scanner sc_IND_mult = new Scanner(System.in);
			String firstNumericPair, secondNumericPair;
		
			System.out.print("Zahl 1 = ");
			firstNumericPair = sc_IND_mult.nextLine();
			System.out.print("Zahl 2 = ");
			secondNumericPair = sc_IND_mult.nextLine();
			
			System.out.println("\n" + firstNumericPair + " * " + secondNumericPair);
			System.out.println("--------");
			
		sc_IND_mult.close();

		
		int fPT1 = 0;
		int fPT2 = 0;
		int sPT1 = 0;
		int sPT2 = 0;
		
		
		for (int i = 0; i < firstNumericPair.length(); i++) {
			char number = firstNumericPair.charAt(i);
			if (i == 0) {
			fPT1 = Character.getNumericValue(number);	
			} else {
				fPT2 = Character.getNumericValue(number);
			}
		}
		
		
		for (int i = 0; i < secondNumericPair.length(); i++) {
			char number = secondNumericPair.charAt(i);
			if (i == 0) {
			sPT1 = Character.getNumericValue(number);		
			} else {
				sPT2 = Character.getNumericValue(number);
			}
		}
		
		System.out.println(fPT1 + "    " + fPT2);
		System.out.println(sPT1 + "    " + sPT2);
		
		
		//first calculation
		int calA1 = fPT1 * sPT1;
		int calA2 = (fPT1 * sPT2) + (sPT1 * fPT2);
		int calA3 = fPT2 * sPT2;
		
		System.out.println("--------");
		System.out.println(calA1 + " " + calA2 + " " + calA3);
		
		//repeat
		String fS = Integer.toString(calA1);
		String sS = Integer.toString(calA2);
		String tS = Integer.toString(calA3);
		
		int sST1 = 0;
		int sST2 = 0;
		int tST1 = 0;
		int tST2 = 0;
	
		if (fS.length() == 1 && sS.length() == 1 && tS.length() == 1) {
			
			//Endergebnis 1
			System.out.println("==> " + fS + "" + sS + "" + tS + "");
			System.out.println("_________");
		} else { for (int i = 0; i < sS.length(); i++) {
					char number = sS.charAt(i);
					if (i == 0) {
						sST1 = Character.getNumericValue(number);
					} else {
						sST2 = Character.getNumericValue(number);
					}
				}
			   for (int i = 0; i < tS.length(); i++) {
				   	char number = tS.charAt(i);
				   	if (i == 0) {
						tST1 = Character.getNumericValue(number);
					} else {
						tST2 = Character.getNumericValue(number);
					}
			   	}
		
				//second calculation
				int calB1 = calA1 + sST1;
				int calB2 = sST2 + tST1;
				int calB3 = tST2;
		
		
		//Endergebnis 2
		System.out.println("==> " + calB1 + "" + calB2 + "" + calB3);
		System.out.println("_________");
		
		
		}
	}
}
