package Theorie._190_OOP._040_Package;

public class Pizza {
	//Standartwerte
	String typ = "Salami";
	int durchmesser = 32;
	
	//Methode (vom Objekt)
	void beschreibePizza() {
		System.out.println("Ich bin eine Pizza!");
		System.out.println(this.typ + " " + this.durchmesser + "cm");
	}
}
