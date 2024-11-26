package Mini_Projects;

import java.util.Scanner;

public class raten_spiel {

	public static void main(String[] args) {
		
		//rate ein Nummber von 1 bis 9
		
		// index
		int randomNR;
		int randomup1;
		int randomdown1;
		
		int geraten = -1;	
		String antwort;
		String l = "ich gebe auf";
		
		randomNR = 1 + (int) (Math.random() * 8);
		randomup1 = randomNR + 1;
		randomdown1 = randomNR - 1;

		System.out.print("Viel Glück: ");
		
		Scanner sc = new Scanner(System.in);
		
		do {

			antwort = sc.nextLine();
			System.out.println(randomNR);
			
			if (antwort.equals("Ich gebe auf")) {
			System.out.println("\nSchade");
			break;
			} 
			
			else
			System.out.print("\nnochmal: ");
			geraten = Integer.parseInt(antwort);
				
				if (geraten == randomNR) {
				System.out.println("\nez");
				break;
				}
	
				else if (geraten == randomup1 || geraten == randomdown1)
				System.out.println("das war aber sehr kapp ");
		
					else
					System.out.println("\n:c");

		} while (geraten != randomNR && !antwort.equals("Ich gebe auf"));
		
		sc.close();
	}
}
