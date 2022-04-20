package Theorie._190_OOP._01_KlassenAttribute;

public class App {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		
		System.out.println(p1); //Theorie._190_OOP._01_KlassenAttribute.Pizza@3d012ddd

		p1.typ = "Salami";
		p1.durchmesser = 30;
		
		System.out.println(p1.typ + ": " + p1.durchmesser + "cm");
		// Salami: 30cm
		
		Pizza p2 = new Pizza();
		
		p2.typ = "Schinken";
		p2.durchmesser = 20;
		p1.durchmesser = 10;
		
		System.out.println(p2.typ + ": " + p2.durchmesser + "cm");
		//Schinken: 20cm

	}

}
