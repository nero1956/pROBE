package Theorie._190_OOP._040_Package;

public class App {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		p1.beschreibePizza();
		
		System.out.println();
		
		Pizza p2 = new Pizza();
		p2.typ = "Margherita";
		p2.durchmesser = 28;
		
		p2.beschreibePizza();

	}

}
