package Loesungen;

import javax.swing.JOptionPane;

public class _01_RechteckBerechnung {

	public static void main(String[] args) {
		double laenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Laenge des Rechtecks ein: "));
		double breite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite des Rechtecks ein: "));
		String einheit = JOptionPane.showInputDialog("Geben Sie die Einheit an: ");
		
		double flaeche = laenge * breite;
		double umfang = (2 * laenge + 2 * breite);
		
		JOptionPane.showMessageDialog(null, "Die eingebene Laenge betraegt: " + laenge + einheit + "\n" 
										+ "Die eingebene Breite betraegt: " + breite + einheit + "\n\n"
										+ "Der Umfang betraegt: " + umfang + einheit + "\n"
										+ "Die Flaeche betraegt: " + flaeche + einheit);

	}

}
