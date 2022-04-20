package Loesungen.buch.kapitel05._02;

import javax.swing.JOptionPane;

public class Rechtecktest {

	public static void main(String[] args) {
		Rechteck rEck = new Rechteck(Double.parseDouble(JOptionPane.showInputDialog("Geben Sie die Laenge des Rechtecks ein: ")),
									 Double.parseDouble(JOptionPane.showInputDialog("Geben Sie bitte die Breite ein: ")));
		
		System.out.println("Lange Seite: " + rEck.getLangeSeite());
		System.out.println("Kurze Seite: " + rEck.getKurzeSeite());
		System.out.println("Diagonale: " + rEck.getDiagonale());
		System.out.println("Flaeche: " + rEck.getFlaeche());
		System.out.println("Umfang: " + rEck.getUmfang());
	}
}
