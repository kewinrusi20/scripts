package Code_types;

import java.util.Arrays;

public class schleife_02 {
	
	// von der 7. Vorlesung
	public static void main(String[] args) {
		
	// Folgendes würde einen Fehler liefern
	// System.out.println(würfel[5]);
	
	// Umkopieren in ein neues Array
	// int[] würfel = new int[5];
	int[] w2 = new int[7];
	
	int x = 0;
	while (x < würfel.length) {
		w2[x] = würfel[x];
		x++;
	}
	
	// das neue Array hat zwei Einträge mehr
	w2[5] = ((int)(Math.random() * 6)) + 1;
	w2[6] = ((int)(Math.random() * 6)) + 1;
	
	// Hilfsmethode zur Ausgabe eines Arrays insgesamt
	System.out.println(Arrays.toString(w2));
}


	}

}
