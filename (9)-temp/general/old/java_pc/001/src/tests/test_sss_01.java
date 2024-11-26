package tests;

import java.util.Scanner;
import java.util.ArrayList;

public class test_sss_01 {

	public static void main(String[] args) {

		test1();
//		test2();

	}

	public static void test1() {
		Scanner kb = new Scanner(System.in);
		
			System.out.println("Hallo");

			System.out.print("Bitte \"Username\" eingeben: ");
			String username = kb.nextLine();

			System.out.println(username.compareTo("root"));
			ArrayList<String> al = new ArrayList<>();
			al.add(username);
			System.out.println(al.get(0));
			
		kb.close();
	}

	public static void test2() {

		Scanner sc_ts2 = new Scanner(System.in);

			System.out.print("Größe (px): ");
			int a = sc_ts2.nextInt();
		
			System.out.print("Größe: " + a + "px");
			
		sc_ts2.close();

	}

}
