package tests;

import java.util.Scanner;

public class if_with_2_conditions {

	public static void main(String[] args) {

		t_01(); //if funktion with 2 condition
	}

	public static void t_01() {

		//Erstelle eine funktion die den Grad der Geschäftsfähigkeit wiedergibt.
		
		// create _ 3x variables
		int age_0 = 0;
		int age_7 = 7;
		int age_18 = 18;
				
		// create _ Scanner
		Scanner sc_age = new Scanner(System.in);
		
			// create _ text field for the output in a new integer variable
			System.out.print("Alter Angabe: ");
			int age = sc_age.nextInt();
		
		// close _ Scanner
		sc_age.close();

		// create _ if with 2 conditions
		if (age >= age_18)
		System.out.println("\nVoll Geschäftsfähig");
		
		else if (age >= age_7)
		System.out.println("\nBeschränkt Geschäftsfähig");
		
		else if (age >= age_0)
		System.out.println("\nGeschäftsfähig Unfähig");
		
			else {
			System.out.println("\nlol?");
			System.out.println("komm in -" + age + " Jahre wieder ...");
			}	
		
	}
}
