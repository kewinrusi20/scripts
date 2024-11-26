package tests;

import java.util.Scanner;

public class test_if_01 {

	public static void main(String[] args) {
		
//		test_01();
		test_02();
		
	}
	
	public static void test_01() {
				
		//create _ Scanner 
		Scanner sc_t01  = new Scanner(System.in);
		
			// text field for the output in a new integer variable
			System.out.print("Angabe: ");
			int as = sc_t01.nextInt();
		
		// close _ Scanner
		sc_t01.close();		
		
		// create _ if condition
		if (as == 1)
		System.out.println(" ez");
		
			else
			System.out.println(" :c");
		
	}
	
	public static void test_02() {

		// create _ Scanner
		Scanner sc_t02 = new Scanner(System.in);
		
			// create _ text field for the output in a new integer variable
			System.out.print("Angebe: ");
			int as = sc_t02.nextInt();
		
		// close _ Scanner
		sc_t02.close();
		
		// create _ alternative to if condition
		var an = (as == 1) ? 4 : 5;
		System.out.println(an);
		
	}
}
