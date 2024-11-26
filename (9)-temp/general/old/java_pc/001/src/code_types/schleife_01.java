package Code_types;

public class schleife_01 {

	public static void main(String[] args) {
		
		System.out.println("Willkommen bei Kniffel!\n");
		
		int[] würfel = new int[5];	// Array der Größe 5, Index läuft von 0 bis 4!
		
		int i = 0;
		while (i < 5) {
			würfel[i] = ((int)(Math.random() * 6)) + 1;

			System.out.println((i + 1) + ". Würfel zeigt: " + würfel[i]);

			i++;
		}

		
		
	}

}
