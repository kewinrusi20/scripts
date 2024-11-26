package tests;

public class functions_a {

	public static void main(String[] args) {

		summe_a();
		//Wtf is this
		summe_b(5, 6);
	}

	
	public static void summe_a() {
		
		int a = 5; 
		int b = 6;
		int somma = a + b;
		System.out.println("somma a: " + somma);
		
	}
	
	
	public static void summe_b(int a, int b) {
		
		int somma = a + b;
		System.out.println("somma b: " + somma);
		
	}
	
	
}
