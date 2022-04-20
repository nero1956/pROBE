package Loesungen.buch.kapitel05._01;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Bitte Radius übergeben: "));
		Kreis k = new Kreis(radius);
		//Objekt vom Typ Kreis wurde erstellt, Referenz k zeigt auf dieses Objekt
		
		double rad = k.getRadius();
		double umf = k.getUmfang();
		
		System.out.println("Radius des Kreises ist: " + k.getRadius());
		System.out.println("Umfang des Kreises ist: " + umf);
		System.out.println("Flaeche des Kreises ist: " + k.getFlaeche());
	}
}
