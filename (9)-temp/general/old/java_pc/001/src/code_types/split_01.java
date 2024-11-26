package Code_types;

public class split_01 {

public static void main(String[] args) {
	
	String s = "Hallo Welt wie geht es Dir";
	var words = s.split(" ");
	
	for (int i = 0; i < s.length(); i++) {  // problem: Länge stimmt nicht überein
	System.out.println(words[i]);
	}
		
}
}
