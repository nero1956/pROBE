package Loesungen.buch.kapitel05._03;

import javax.swing.JOptionPane;

public class Rechtecktest {

	public static void main(String[] args) {
		
		Rechteck rEck = new Rechteck(Double.parseDouble(JOptionPane.showInputDialog("Geben Sie bitte die Laenge des Rechtecks an: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Geben Sie bitte die Breite des Rechtecks an: ")));
		
		System.out.println("Lange Seite: " + rEck.getLangeSeite());
		System.out.println("Kurze Seite: " + rEck.getKurzeSeite());
		System.out.println("Diagonale: " + rEck.getDiagonale());
		System.out.println("Flaeche: " + rEck.getFlaeche());
		System.out.println("Umfang: " + rEck.getUmfang());
		
		System.out.println("Laenge: " + rEck.getLeange());
		rEck.laengeAusgeben();
	}
}
