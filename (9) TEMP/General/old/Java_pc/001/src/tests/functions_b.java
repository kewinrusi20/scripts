package tests;

import java.util.Scanner;

public class functions_b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("a: ");
			int a = sc.nextInt();
			
			System.out.print("b: ");
			int b = sc.nextInt();
			
			int s = summe(a, b);
			System.out.print("somma/2: " + s/2);
			
		}
	}

	
	public static int summe(int a, int b) {
		int somma = a + b;
		System.out.println("somma: " + somma);
		return somma;
	}
	
}
