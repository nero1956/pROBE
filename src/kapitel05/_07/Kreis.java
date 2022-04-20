package Loesungen.buch.kapitel05._07;

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
	
	//Kreis Flächenberechnung:PI * r * r (Radius im Quadrat)
	double getFlaeche() {
		return Math.PI * radius * radius;
	}
 }
