package Loesungen.buch.kapitel05._05;

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
	
	void setRadiusByUmfang(double u) {
		this.radius = u / (2 * Math.PI);
	}
	
	void setRadiusByFlaeche(double f) {
		this.radius = Math.sqrt(f / Math.PI);
	}
	

 }
