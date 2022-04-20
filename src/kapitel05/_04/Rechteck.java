package Loesungen.buch.kapitel05._04;

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
	
	double getLaenge() {
		return this.laenge;
	}
	
	double getBreite() {
		return this.breite;
	}
	
	double getLangeSeite() {
		if (laenge > breite) return laenge;
		else {
			double tmp = laenge;
			laenge = breite;
			breite = tmp;
			return laenge;
		}
	}
	
	double getKurzeSeite() {
		if (breite < laenge) return breite;
		else {
			double tmp = laenge;
			laenge = breite;
			breite = tmp;
			return breite;
		}
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
		double laenge = 5.4; //variable wird nicht als Fehler markiert, lokale Variablen werden immer vorgezogen bei Namensgleichheit. Außer man setzt "this" davor, dann wird das Element des Objekts verwendet
		System.out.println("Laenge: " + laenge);
	}
	
	void laengeVergroessern(double l) {
		this.laenge += l;
	}
	
	void breiteVergroessern(double b) {
		this.breite += b;
	}
	
	void laengeVerkleinern(double l) {
		this.laenge -= l;
	}
	
	void breiteVerkleinern(double b) {
		this.breite -= b;
	}
}
