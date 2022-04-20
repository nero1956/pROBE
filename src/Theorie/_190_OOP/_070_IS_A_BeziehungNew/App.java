package Theorie._190_OOP._070_IS_A_BeziehungNew;

public class App {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		System.out.println("Pizza p1: " + p1.toString());
		
		System.out.println("Pizza p1: kcal: " + p1.getKcal() + "kcal, Menge: " + p1.getMenge() 
				+ "gr\nTyp: " + p1.getTyp() + ", Durchmesser: " + p1.getDurchmesser() + "cm");
		
		Pizza p2 = new Pizza(260, 120, "Spinat", 28);
		System.out.println("\nPizza p2: " + p2.toString());
		System.out.println("Pizza p2: kcal: " + p2.getKcal() + "kcal, Menge: " + p2.getMenge() 
		+ "gr\nTyp: " + p2.getTyp() + ", Durchmesser: " + p2.getDurchmesser() + "cm");
	}

}
