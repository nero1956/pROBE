package Loesungen.buch.kapitel05._03;

public class Rechteck {
	double laenge;
	double breite;
	
	Rechteck() {
		this.laenge = 0;
		this.breite = 0;
	}
	
	Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}
	
	void setLaenge(double l) {
		this.laenge = l;
	}
	
	void setBreite(double b) {
		this.breite = b;
	}
	
	void setSeiten(double l, double b) {
		this.laenge = l;
		this.breite = b;
	}
	
	double getLeange() {
		return this.laenge;
	}
	
	double getBreite() {
		return this.breite;
	}
	
	double getLangeSeite() {
		if (laenge > breite) return laenge;
		else return breite;
	}
	
	double getKurzeSeite() {
		if (laenge < breite) return laenge;
		else return breite;
	}
	
	double getDiagonale() {
		return Math.sqrt(laenge * laenge + breite * breite);
	}
	
	double getFlaeche() {
		return laenge * breite;
	}
	
	double getUmfang() {
		return 2 * laenge + 2 * breite;
	}
	
	void laengeAusgeben() {
		double laenge = 5.4;
		System.out.println("Länge: " + laenge);
	}
}
