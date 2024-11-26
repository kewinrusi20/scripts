package SL2;

import java.util.Scanner;

public class Abgabe {

	public static void main(String[] args) {

//		Aufgabe_1();
//		Aufgabe_2();
//		Aufgabe_3();
//		Aufgabe_4();
//		Aufgabe_5();
//		Aufgabe_bonus();

	}

	public static void Aufgabe_1() {

		// creating _ scanner
		Scanner sc_angabe_radius = new Scanner(System.in);
		double radius;

		// getting value from console
		System.out.print("Angabe Radius: ");
		radius = sc_angabe_radius.nextDouble();
		System.out.println("Radius: \t" + radius);

		// closing scanner
		sc_angabe_radius.close();

		// calculating and printing the Umfang and Fläche
		double umfang = 2 * Math.PI * radius;
		double flauche = Math.PI * Math.pow(radius, 2);

		System.out.println("Umfangs: \t" + umfang);
		System.out.println("Fläche: \t" + flauche);

	}

	public static void Aufgabe_2() {

		Scanner sc_angabe_abc = new Scanner(System.in);
		double a, b, c;

		System.out.print("a = ");
		a = sc_angabe_abc.nextDouble();
		System.out.print("b = ");
		b = sc_angabe_abc.nextDouble();
		System.out.print("c = ");
		c = sc_angabe_abc.nextDouble();

		sc_angabe_abc.close();

		double x1 = ((-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a);
		double x2 = ((-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a);

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

	}

	public static void Aufgabe_3() {

	    Scanner sc_DND = new Scanner(System.in);
	    int nummer, uhrzeit;

	    System.out.print("Nummer: ");
	    nummer = sc_DND.nextInt();

	    System.out.print("Uhrzeit: ");
	    uhrzeit = sc_DND.nextInt();

	    int mutter = 1;
		int freundin = 2;

	    sc_DND.close();


	    System.out.println();

	    if (uhrzeit >= 0 && uhrzeit <= 23) {

	        // DND
	        if (uhrzeit <= 10 || uhrzeit >= 22) {

	            if (nummer == freundin) { // Freundin ruft an
	                System.out.println("Handy klingelt");
	                System.out.println("Freundin ruft an");

	            } else if (nummer == mutter && (uhrzeit >= 8 && uhrzeit <= 10)) { // Mutter ruft an
	                System.out.println("Handy klingelt");
	                System.out.println("Mutter ruft an");

	            } else {
	                System.out.println("Handy klingelt nicht");
	            }

	        } else {
	            System.out.println("Handy klingelt");
	        }

	    } else {
	        System.out.println("Uhrzeit: " + "falsche Angabe");
	    }
	}

	public static void Aufgabe_4() {

		Scanner sc_pass = new Scanner(System.in);
		String pass1, passw;

		System.out.print("Eingabe Password: \t");
		pass1 = sc_pass.nextLine();
		System.out.print("Password wiederholen: \t");
		passw = sc_pass.nextLine();
		System.out.println("");

		sc_pass.close();

		
		if (pass1.length() != 3) {
			if (pass1.length() > 3) {
				System.out.println("Password length: \t too long");
			} else {
				System.out.println("Password length: \t too short");
			}

		} else {
			System.out.println("Password length: \t good");
		}

		if (pass1.equals(passw)) {
			System.out.println("Password equality: \t good");
		} else {
			System.out.println("Password equality: \t do not match");
		}

		// creation _ 3 x boolean's Variable
		boolean hasNumber = false;
		boolean hasBigChar = false;
		boolean hasSmallChar = false;

		for (int i = 0; i < pass1.length(); i++) {
			char currentChar = pass1.charAt(i);
			int asciiChar = (int) currentChar;
			// System.out.println(currentChar + ": " + asciiChar);

			if (asciiChar >= 48 && asciiChar <= 57) {
				hasNumber = true;
			}

			if (asciiChar >= 65 && asciiChar <= 90) {
				hasBigChar = true;
			}

			if (asciiChar >= 97 && asciiChar <= 122) {
				hasSmallChar = true;
			}
		}

		if (hasNumber == true) {
			System.out.println("Password: \t\t has number");
		} else {
			System.out.println("Password: \t\t has not number");
		}

		if (hasBigChar == true) {
			System.out.println("Password: \t\t has a big character");
		} else {
			System.out.println("Password: \t\t has not a big character");
		}

		if (hasSmallChar == true) {
			System.out.println("Password: \t\t has a small character");
		} else {
			System.out.println("Password: \t\t has not a small character");
		}
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
	
	
	public static void Aufgabe_bonus() {
		
		Scanner sc_d = new Scanner(System.in);
		
			int a = 31;
			int b = 3;
			
			System.out.println("Wert 1 = " + a);
			System.out.println("Wert 2 = " + b);
			
			int e = a / b;
			System.out.println("\nErgebnis = " + e);
		
			int r = e - a;
			System.out.println("Restwert = " + r);
					
		sc_d.close();
	}
	
	
}