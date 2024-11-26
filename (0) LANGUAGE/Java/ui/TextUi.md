```java

import java.util.Scanner;

import de.hs_mannheim.informatik.bank.facade.Banksystem;

public class UI {
	private Banksystem bs;
	Scanner sc = new Scanner(System.in);

	public UI(Banksystem bs) {
		this.bs = bs;
		hauptmenü();
	}

	private void hauptmenü() {
		System.out.println("Willkommen bei der " + bs.getBankname() + "!");

		mainloop: 
			while (true) {
				System.out.println();
				System.out.println("--------");
				System.out.println("Hauptmenü");
				System.out.println("1 -> Konten anzeigen");
				System.out.println("2 -> Konto anlegen");
				System.out.println("3 -> Geld einzahlen");
				System.out.println("4 -> Geld auszahlen");
				System.out.println("5 -> Kontoauszug drucken");
				System.out.println("6 -> Überweisung beauftragen");
				System.out.println("7 -> Saldo abfragen");

				System.out.println("9 -> Beenden");
				System.out.println();

				System.out.print("> ");
				int input = Integer.parseInt(sc.nextLine());
				System.out.println();

				try {
					switch(input) {
					case 1: kontenAnzeigen(); break;
					case 2: kontoAnlegen(); break;
					case 3: geldEinzahlen(); break;
					case 4: geldAuszahlen(); break;
					case 5: kontoauszugDrucken(); break;
					case 6: überweisungBeauftragen(); break;
					case 7: saldoAbfragen(); break;
					case 9: break mainloop;
					}

				} catch (Exception e) {
					System.err.println(e.getLocalizedMessage());
				} 
				System.out.println();
			}
		System.out.println("Auf Wiedersehen!");
	} // hauptmenü

	private void kontenAnzeigen() {}
	private void kontoAnlegen() throws Exception {}
	private void geldEinzahlen() throws Exception {}
	private void geldAuszahlen() throws Exception {}
	private void kontoauszugDrucken() {}
	private void überweisungBeauftragen() throws Exception {}

}
```