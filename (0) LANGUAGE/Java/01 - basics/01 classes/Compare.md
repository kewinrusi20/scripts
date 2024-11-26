
```java
public void kontoAnmelden() {
	System.out.println("Bitte Konto ID eingabe:");
	int eingabe = sc.nextInt();
	if (vs.isKontoDa(eingabe)) {
		System.out.println(
		"Willkommen " + vs.getListeKonten().get(eingabe).getName());
		if (vs.getListeKonten().get(eingabe) instanceof Lernende) {
			System.out.println("Lernende");
		}
		adminUi.hauptMenue(eingabe);
		kundeUi.hauptMenue(eingabe);
	}
}
```
