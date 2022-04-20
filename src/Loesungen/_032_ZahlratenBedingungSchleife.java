package Loesungen;

import javax.swing.JOptionPane;

public class _032_ZahlratenBedingungSchleife {

	public static void main(String[] args) {
		final int MIN_RATEWERT = 1;
		final int MAX_RATEWERT = 30;
		
		final int ANZAHL_TIPP = 5;
		final int ANAZHL_ABBRUCHABFRAGE = 10;
		final int ANZAHL_ABBRUCH = 30;
		
		int versuche = 0;
		boolean hatGewonnen = false;
		boolean hatAbgebrochen = false;
		
		int zahl;
		String ratezahl = "";
		
		JOptionPane.showMessageDialog(null, "Herzlich Willkommen zum Zahlenrate - Spiel. Viel Glück beim Raten");
		
		do {
			//System.out.println(ratezahl);
			if(versuche > 0) {
				JOptionPane.showMessageDialog(null, "Ihre Zahl lag nicht in den Gewinnparametern. Versuchen Sie es erneut.");
			}
			ratezahl = JOptionPane.showInputDialog("Bitte Geben Sie Ihre Zahl ein");
			
			if(ratezahl != null) {
				if(ratezahl.isBlank()) {
					System.out.println("Ratezahl ist leer");
				} else {
					zahl = Integer.parseInt(ratezahl);
					versuche++;
					
					switch(versuche) {
						case ANZAHL_TIPP: JOptionPane.showMessageDialog(null, "Kleiner Tipp: Die Zahl muss zwischen 1 und 30 liegen");
						break;
						case ANAZHL_ABBRUCHABFRAGE: String abfrage = JOptionPane.showInputDialog("Ohjeee... wollen sie es weiter"
													+ "probieren?").toLowerCase();
													if(abfrage.equals("nein")) hatAbgebrochen = true;
						break;
						case ANZAHL_ABBRUCH: JOptionPane.showMessageDialog(null, "Zum Schutze Ihre Gesundheit brechen wir das Spiel lieber ab.");
											hatAbgebrochen = true;
						break;					
					}
					if(zahl >= MIN_RATEWERT && zahl <= MAX_RATEWERT && zahl % 5 == 0) {
						hatGewonnen = true;
					}				
				}	
			} else {
				System.exit(0);
			}
			
		} while (hatGewonnen == false && hatAbgebrochen == false);
		if(hatGewonnen == true) {
			JOptionPane.showMessageDialog(null, "Erfogreich erraten! Bis zum nächsten mal!");
		} else {
			JOptionPane.showMessageDialog(null, "Bis zum nächsten mal.");
		}
	}
}
