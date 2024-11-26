package tests;

import java.util.Scanner;

public class test_sss_02 {

	public static void main(String[] args) {

		System.out.println("Willkommen beim Zahlen raten!\n");
		System.out.println("Bitte rate eine Zufallszahl von 0 bis 9. Du kannst das Spiel mit 'q' beenden.");	

		int zufallszahl = (int) (Math.random() * 10);
		int geraten = -1;

		Scanner kb = new Scanner(System.in);

			do {
				System.out.print("Deine Eingabe: ");
				String eingabe = kb.nextLine();

				if (eingabe.equals("q"))
				{break;}

			geraten = Integer.parseInt(eingabe);
			
			if (geraten == zufallszahl)
			System.out.println("Das war ein Treffer, Du hast meine " + zufallszahl + " geraten!"); 
				else
				System.out.println("Leider falsch! Versuch es doch noch einmal.\n");

		} while (geraten != zufallszahl);

		System.out.println("Cheerio!");
		
		kb.close();
		
	}
}