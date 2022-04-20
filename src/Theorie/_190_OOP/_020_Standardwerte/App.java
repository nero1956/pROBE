package Theorie._190_OOP._020_Standardwerte;

public class App {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		
		System.out.println(p1.typ + ": " + p1.durchmesser + "cm" );
		//Spinat: 28cm
		
		p1.typ = "Salami";
		
		System.out.println(p1.typ + ": " + p1.durchmesser + "cm" );
		//Salami: 28cm
	}

}
