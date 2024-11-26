package tests;

import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {

		Aufgabe_5();

	}

	public static void Aufgabe_5() {
		Scanner sc = new Scanner(System.in);

		int ersteZahl = sc.nextInt();
		int zweiteZahl = sc.nextInt();
		String ez = String.valueOf(ersteZahl);
		String zz = String.valueOf(zweiteZahl);

		int e1 = 0;
		int e2 = 0;
		int z1 = 0;
		int z2 = 0;

		// For Schleife zum Teilen der 2-stelligen Zahl in jeweils 1 Stelle zum Rechnen

		for (int i = 0; i < ez.length(); i++) {
			char zahl = ez.charAt(i);
			int asciicode = (int) zahl;
			if (i == 0) {
				e1 = Character.getNumericValue(asciicode);
			} else {
				e2 = Character.getNumericValue(asciicode);
			}
		}

		for (int i = 0; i < zz.length(); i++) {
			char zahl = zz.charAt(i);
			int asciicode = (int) zahl;
			if (i == 0) {
				z1 = Character.getNumericValue(asciicode);
			} else {
				z2 = Character.getNumericValue(asciicode);
			}
		}

		int a1 = e1 * z1; // Linke Berechnung
		int a2 = (e1 * z2) + (e2 * z1); // Kreuzberechnung
		int a3 = e2 * z2; // Rechte Berechnung

		String b1 = String.valueOf(a1);
		String b2 = String.valueOf(a2);
		String b3 = String.valueOf(a3);

		// Hier wird überprüft ob es nötig ist weiter zu machen oder die Aufgabe schon
		// beendet ist.
		if (b1.length() == 1 && b2.length() == 1 && b3.length() == 1) {
			System.out.print(b1);
			System.out.print(b2);
			System.out.println(b3);
			return;
		}
		// Zwischen variablen für die einzelnen ziffern
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		
		for (int i = 0; i < b3.length(); i++) {
			char zahl = b3.charAt(i);
			int asciicode = (int) zahl;
			if (i == 0) {
				n1 = Character.getNumericValue(asciicode);
			} else {
				n2 = Character.getNumericValue(asciicode);
			}
		}
		
		for (int i = 0; i < b2.length(); i++) {
			char zahl = b2.charAt(i);
			int asciicode = (int) zahl;
			if (i == 0) {
				n3 = Character.getNumericValue(asciicode);
			} else {
				n4 = Character.getNumericValue(asciicode);
			}
		}
		
		int p1 = a1 + n3;
		int p2 = n4 + n1;
		int p3 = n2;
		System.out.print(p1);
		System.out.print(p2);
		System.out.println(p3);
		
		sc.close();
	}

}
