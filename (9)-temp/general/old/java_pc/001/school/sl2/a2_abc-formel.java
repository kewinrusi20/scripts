package SL2;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {

		Aufgabe_2();
	
	}
	
	
	public static void Aufgabe_2() {
		
		// creating _ scanner + variable 
		Scanner sc_angabe_abc = new Scanner(System.in);
			double a, b, c;
						
			System.out.print("a = ");
			a = sc_angabe_abc.nextDouble();
			System.out.print("b = ");
			b = sc_angabe_abc.nextDouble();
			System.out.print("c = ");
			c = sc_angabe_abc.nextDouble();
		
		sc_angabe_abc.close();		

		
		double x1 = ((- b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a);
		double x2 = ((- b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a);
	
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
	}

}
