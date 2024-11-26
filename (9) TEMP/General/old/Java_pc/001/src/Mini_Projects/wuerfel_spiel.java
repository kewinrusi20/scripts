package Mini_Projects;

public class wuerfel_spiel {

public static void main(String[] args) {
	

//	System.out.println(diceRandom);  //outcome check
	
	// index
	int diceNumber = 5;
	int diceSides = 6;
	
	for (int i = 0; i < diceNumber; i++) {
	int diceResult = 1 + (int) (Math.random() * diceSides);
	System.out.println(i + 1 + ". " + "Würfergebnis ==> " + diceResult);
	}

}	
}
