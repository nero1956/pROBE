package Loesungen.buch.kapitel05._06;

public class Kreis {
	double radius;
	
	Kreis() {
		this.radius = 0;
	}
	
	Kreis(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return this.radius;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Kreis Radiusberechnung: 2 * PI * r
	double getUmfang() {
		return 2 * Math.PI * this.radius; 
	}
	
	//Kreis Fl‰chenberechnung:PI * r * r (Radius im Quadrat)
	double getFlaeche() {
		return Math.PI * radius * radius;
	}
	
	//Kreis Radius mit Umfang: u / (2 * PI)
	//Benennung scheiﬂe, denn SET Methoden setzen Felder!
	void setUmfang(double u) {
		this.radius = u / (2 * Math.PI);
	}
	
	//Kreis Radius mit Flaeche: Dir Wurzel aus (fleache / PI)
	//Benennung scheiﬂe, denn SET Methoden setzen Felder!
	void setFlaeche(double f) {
		this.radius = Math.sqrt(f / Math.PI);
	}
 }
