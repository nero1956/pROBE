package Loesungen.buch.kapitel05._04;

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
		
		System.out.println("---------- Aufgabe 4 --------------");
		rEck.laengeVergroessern(3.2);
		rEck.breiteVergroessern(5.9);
		
		System.out.println("Laenge nach Vergroessern: " + rEck.getLaenge());
		System.out.println("Breite nach Vergroessern: " + rEck.getBreite());
		
		System.out.println("Lange Seite: " + rEck.getLangeSeite());
		System.out.println("Kurze Seite: " + rEck.getKurzeSeite());
		
		System.out.println("Laenge: " + rEck.getLaenge());
		System.out.println("Breite: " + rEck.getBreite());
	}
}
