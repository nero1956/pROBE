package Loesungen;

import javax.swing.JOptionPane;

public class _024_1_Fakultaet {

	public static void main(String[] args) {
		// sysout + Strg + Leertaste = System.out.println();
		// 1.Step
		String eingabeZahlText = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein: ");
		int eingabeZahl = Integer.parseInt(eingabeZahlText);
		int ergebnis = 1;
		String ergebnisMessage = "Das Ergebnis der " + eingabeZahl + "! ist " + ergebnis; 
		
		// 3.Step
		if (eingabeZahl >= 0 && eingabeZahl <= 10) {
			if(eingabeZahl == 0 || eingabeZahl == 1) {
				JOptionPane.showMessageDialog(null, ergebnisMessage);
			} else {
				// 2.Step
				for (int i = 1; i <= eingabeZahl; i++) {
					ergebnis = ergebnis * i;
				}
				ergebnisMessage = "Das Ergebnis der " + eingabeZahl + "! ist " + ergebnis;
				JOptionPane.showMessageDialog(null, ergebnisMessage);
			}	
		} else {
			System.out.println("Eingabe nur von 1 bis 10 bidde!");
		}
	}
}
