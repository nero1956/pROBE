package Loesungen.buch.kapitel05._07;

import javax.swing.JOptionPane;

public class FlaechengleicherKreis {

	public static void main(String[] args) {
		double rLaenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Länge des Rechtecks ein: "));
		double rBreite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite des Rechtecks ein: "));
		
		Rechteck r = new Rechteck(rLaenge, rBreite);
		
		double kRadius = Math.sqrt(r.getFlaeche() / Math.PI);
		Kreis k = new Kreis(kRadius);
		
		System.out.println("Rechtecklaenge: " + r.getLeange());
		System.out.println("Rechteckbreite: " + r.getBreite());
		System.out.println("Rechteckflaeche: " + String.format("%.2f", r.getFlaeche()));
		System.out.println("\nKreisradius: " + String.format("%.2f", k.getRadius()));
		System.out.println("Kreisflaeche: " + String.format("%.2f", k.getFlaeche()));
	}
}
