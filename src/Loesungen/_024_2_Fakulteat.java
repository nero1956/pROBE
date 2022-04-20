package Loesungen;

import javax.swing.JOptionPane;

public class _024_2_Fakulteat {

	public static void main(String[] args) {
		int eingabeZahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl zwischen 0 und 10 ein"));
		int ergebnis = 1;
		String ergebnisMsg = "Das Ergebnis der " + eingabeZahl + "! ist: " + ergebnis;
		
		if(eingabeZahl >= 0 && eingabeZahl <= 10) {
			if(eingabeZahl == 0 || eingabeZahl == 1) {
				JOptionPane.showMessageDialog(null, ergebnisMsg);
			} else {
				for (int i = 1; i <= eingabeZahl; i++) {
					ergebnis *= i;
				}
				ergebnisMsg = "Das Ergebnis der " + eingabeZahl + "! ist: " + ergebnis;
				JOptionPane.showMessageDialog(null, ergebnisMsg);
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Bitte beim nächsten mal eine Zahl zwischen 0 und 10 eingeben");
		}
		
	}

}
