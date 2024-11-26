package SL2;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		
		Aufgabe_4();

	}

	public static void Aufgabe_4() {
		
		// create _ Scanner
		Scanner sc_pass = new Scanner(System.in);
		
			// imput & repeat _ password
			System.out.print("Eingabe Password: \t");
				String pass1 = sc_pass.nextLine();
			System.out.print("Password wiederholen: \t");
				String passw = sc_pass.nextLine();
			System.out.println("");	
				
		// close _ Scanner	
		sc_pass.close();
	
		
		// verification
		if (pass1.length() != 3) {
			
			if (pass1.length() > 3) 
			{System.out.println("Password length: \t too long");} 
		
				else 
				{System.out.println("Password length: \t too short");}
			
			} else 
			{System.out.println("Password length: \t good");}
		

		if	(pass1.equals(passw)) 
		{System.out.println("Password equality: \t good");}
		
			else 
			{System.out.println("Password equality: \t do not match");}
		
		
		// creation _ 3 x boolean's Variable
		boolean hasNumber = false;
		boolean hasBigChar = false;
		boolean hasSmallChar = false;	
		
		for (int i = 0; i < pass1.length(); i++) {
			char currentChar = pass1.charAt(i);
			int asciiChar = (int) currentChar;	
			
			// 	System.out.println(currentChar + ": " + asciiChar);
			if (asciiChar >= 48 && asciiChar <= 57)
			hasNumber = true;
			
			if (asciiChar >= 65 && asciiChar <= 90)
			hasBigChar = true;
			
			if (asciiChar >= 97 && asciiChar <= 122)
			hasSmallChar = true;
		}
	
		
		if (hasNumber == true )
		System.out.println("Password: \t\t has number");
		
			else
			System.out.println("Password: \t\t has not number");
		
		
		if (hasBigChar == true )
		System.out.println("Password: \t\t has a big character");
		
			else
			System.out.println("Password: \t\t has not a big character");
	
		
		if (hasSmallChar == true )
		System.out.println("Password: \t\t has a small character");
		
			else
			System.out.println("Password: \t\t has not a small character");	
		
	}
}
