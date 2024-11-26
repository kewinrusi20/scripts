package Mini_Projects;

public class Password_Check {

public static void main(String[] args) {

	// all the old passwords	
	
	int passOldCount = 5;
	String[] passOld = new String[passOldCount];
	passOld[0] = "agAa3dda";
	passOld[1] = "hs2Kaf6n";
	passOld[3] = "uianErus";
	passOld[3] = "ta8<uSef";
	passOld[4] = "ts40u7Sm";
	
	
	// new password
	String passNew = "ao!N54b2";
	String passRepeat = "ao!N54b2";
	
	
	// password check variable
	boolean passEqualsCheck = false;
	
	boolean passLengthCheck = false;
	int lengthMin = 8;
	int lengthMax = 32;
	
	boolean charBigCheck = false;
	boolean charSmallCheck = false;
	boolean charNumberCheck = false;
	boolean charSymbolCheck = false;
	
	
	for (int j = 0; j < passOldCount; j++) {
		
	}
	
	
	// password check functions
	if (passNew.equals(passRepeat))
		passEqualsCheck = true;
		
	if (passNew.length() >= lengthMin && passNew.length() <= lengthMax)
		passLengthCheck = true;
		
	for (int i = 0; i < passNew.length(); i++) {
		char passChar = passNew.charAt(i);
			
		if (passChar >= 'A' && passChar <= 'Z')
			charBigCheck = true;
		
		if (passChar >= 'a' && passChar <= 'z')
			charSmallCheck = true;
		
		if (passChar >= '0' && passChar <= '9')
			charNumberCheck = true;
		
		if (passChar == '.' || passChar == ',' || passChar == '!' || passChar == '?')
			charSymbolCheck = true;
	}		
	
	
	//Error Fled
	if (!charBigCheck)
	System.out.println("Großbuchstabe fällt");
		
	else if (!charSmallCheck)
	System.out.println("Kleinbuchstabe fällt");
		
	else if (!charNumberCheck)
	System.out.println("Nummber fällt");
	
	else if (!charSymbolCheck)
	System.out.println("Symbol fällt");
	
		else
		return;
	
	
	System.out.println("Password gültig");
	
	}
}

