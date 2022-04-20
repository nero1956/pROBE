package Theorie._190_OOP._050_Konstruktor;

public class Pizza {
	
	String typ;
	int durchmesser;
	
	Pizza() {
		this.typ = "Salami";
		this.durchmesser = 30;
		System.out.println("Pizza wurde gebacken!");
	}
	
	Pizza(String typ) {
		this(typ, 30);
	}
	
	Pizza(int durchmesser) {
		this("Salami", durchmesser);
	}
	
	Pizza(String typ, int durchmesser) {
		this.typ = typ;
		this.durchmesser = durchmesser;
	}
	
	void beschreibePizza() {
		System.out.println("Ich bin eine Pizza!");
		System.out.println(this.typ + " " + this.durchmesser + "cm");
	}
}
