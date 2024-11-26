package tests;

public class Return {

public static void main(String[] args) {
	
	String passNew = "ao!n54b2";
	String passRepeat = "ao!n54b2";
	
	if (!passNew.equals(passRepeat)) {
		System.out.println("die Passwords stimmten nicht überein");
		return;
		}

	if (passNew.length() != 8) {
		System.out.println("Password zu kurz");
		return;
		}
	
	System.out.println("Password gültig");
	
	
	
	
	
	
	
	
	
	
}
}
