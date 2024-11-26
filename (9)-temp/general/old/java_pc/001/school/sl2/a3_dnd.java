package SL2;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {

		Aufgabe_3();

	}

	public static void Aufgabe_3() {

		Scanner sc_DND = new Scanner(System.in);
		int nummer, uhrzeit;

		System.out.print("Nummer: ");
		nummer = sc_DND.nextInt();

		System.out.print("Uhrzeit: ");
		uhrzeit = sc_DND.nextInt();

		// nummer mutter = 1
		// nummer freundin = 2

		sc_DND.close();

		System.out.println();

		if (uhrzeit >= 0 && uhrzeit <= 23) {

			// DND
			if (uhrzeit <= 10 || uhrzeit >= 22) {

				if (nummer == 2) { // Freundin ruft an
					System.out.println("Handy klingelt");
					System.out.println("Freundin ruft an");

				} else if (nummer == 1 && (uhrzeit >= 8 && uhrzeit <= 10)) { // Mutter ruft an
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
}
