package Theorie._190_OOP._030_Methoden;

public class Pizza {
	String typ = "Spinat";
	int durchmesser = 32;
	
	void beschreibePizza() {
		System.out.println("Ich bin eine Pizza! " + "Mein Typ ist: " + typ + ". " + "Mein Durchmesser beträgt: " + durchmesser);
	}
}
