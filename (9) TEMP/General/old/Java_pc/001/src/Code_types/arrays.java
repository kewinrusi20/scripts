package Code_types;

public class arrays {

public static void main(String[] args) {
	
	//Einmal inizialisiert, kann nicht mehr wie bei Python geändert werden,
	//kann nur neu inizialisiert werden.
	
	
	// ---------------------------------------------------------------------
	
	int[] x = {1, 2, 3}; //no error

	// ---------------------------------------------------------------------
	
	int[] y = new int[3];
	y[0] = 1;
	y[1] = 2;
	y[2] = 3;

	// ---------------------------------------------------------------------
	
	//zu erst Deklarieren, dann füllen
	int[] z;
	z = new int[] {1, 2, 3}; 
	
	//or
	z = new int[3]; 
	z[0] = 1;
	z[1] = 2;
	z[2] = 3;
	
//		z = {1, 2, 3}; //do not work

	// ---------------------------------------------------------------------
	
	//wtf
//		java.util.Arrays.fill(g, 17);
}
}
