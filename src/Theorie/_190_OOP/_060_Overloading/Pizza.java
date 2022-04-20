package Theorie._190_OOP._060_Overloading;

public class Pizza {
	String typ;
	int durchmesser;
	int dicke;
	
	Pizza() {
		this.typ = "Salami";
		this.durchmesser = 32;
		System.out.println("Es wurde eine Pizza gebacken!");
	}
	
	Pizza(String typ) {
		this.typ = typ;
		this.durchmesser = 32;
		System.out.println("Es wurde eine Pizza gebacken!");
	}
	
	
	Pizza(int durchmesser) {
		this.typ = "Salami";
		this.durchmesser = durchmesser;
		System.out.println("Es wurde eine Pizza gebacken!");
	}

	
	Pizza(String typ, int durchmesser) {
		this.typ = typ;
		this.durchmesser = durchmesser;
		System.out.println("Es wurde eine Pizza gebacken!");
	}
	
	void beschreibePizza() {
		System.out.println(this.typ + " " + this.durchmesser + "cm");
	}
} 
