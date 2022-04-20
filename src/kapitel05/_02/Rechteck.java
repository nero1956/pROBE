package Loesungen.buch.kapitel05._02;

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
	
	void setLaenge (double l) {
		this.laenge = l;
	}
	
	void setBreite (double b) {
		this.breite = b;
	}
	
	void setSeiten (double l, double b) {
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
		if(this.laenge > this.breite) return this.laenge;
		return breite;
	}
	
	double getKurzeSeite() {
		if (this.laenge < this.breite) return this.laenge;
		return this.breite;
	}
	
	double getDiagonale() {
		return Math.sqrt(this.laenge * this.laenge + this.breite * this.breite);
	}
	
	double getFlaeche() {
		return this.laenge * this.breite;
	}
	
	double getUmfang() {
		return 2* this.laenge + 2 * this.breite;
	}
}
