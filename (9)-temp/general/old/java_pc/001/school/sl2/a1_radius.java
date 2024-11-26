package SL2;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		
//		Aufgabe1a();
//		Aufgabe2b();
	
	}
		
		
	public static void Aufgabe1a() {	
		
		// creating _ scanner
		System.out.print("Angabe Radius: ");
		Scanner sc_angabe_radius = new Scanner(System.in);

		// getting value from console
		double radius;
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

}
