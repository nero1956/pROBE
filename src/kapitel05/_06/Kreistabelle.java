package Loesungen.buch.kapitel05._06;

import javax.swing.JOptionPane;

public class Kreistabelle {

	public static void main(String[] args) {
		final int ANZAHL_ZEILEN = 30;
		final double RADIUS_ERHOEHUNG = 5;
		
		Kreis k = new Kreis(Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Startradius der Kreistabelle ein:")));
		
		System.out.println("Radius \t\tUmfang \t\tFlaeche");
		for(int i = 0; i < ANZAHL_ZEILEN; i++) {
			System.out.println(String.format("%.2f", k.getRadius())
					+ "\t\t" + String.format("%.2f", k.getUmfang())
					+ "\t\t" + String.format("%.2f", k.getFlaeche()));
			k.setRadius(k.getRadius() + RADIUS_ERHOEHUNG);
		}
	}
	
}
