package Theorie._190_OOP._050_Konstruktor;

public class App {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		p1.beschreibePizza();
		
		System.out.println();
		
		Pizza p2 = new Pizza("Margherita", 30);
		p2.beschreibePizza();
		
		System.out.println();
		
		Pizza p3 = new Pizza("Spinat");
		p3.beschreibePizza();
		

	}

}
