package Loesungen.buch.kapitel05._01;

public class Kreis {
	double radius;
	
	Kreis() {
		radius = 0.0;
	}
	
	Kreis(double r) {
		radius = r;
	}
	
	double getRadius() {
		return radius;
	}
	
	void setRadius(double r) {
		radius = r;
	}
	
	double getUmfang() {
		double d = 2 * Math.PI * radius;
		return d;
	}
	
	double getFlaeche() {
		return Math.PI * radius * radius;
	}
 }
