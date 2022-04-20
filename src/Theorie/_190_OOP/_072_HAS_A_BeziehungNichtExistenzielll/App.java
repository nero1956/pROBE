package Theorie._190_OOP._072_HAS_A_BeziehungNichtExistenzielll;

public class App {

	public static void main(String[] args) {
		// Es wird eine Tomate erzeugt, die der Pizza als Zutat übergeben wird.
		// Allerdings sind beide nicht von einander abhängig. Die Pizza lebt weiter ohne
		// Tomate und nicht jede Tomate muss auf einer Pizza liegen.
		
		Tomate t1 = new Tomate("rot-orange");
		Pizza p1 = new Pizza("Spinat", 32, t1);
		System.out.println(p1.toString());
		System.out.println("Farbe der Tomate: " + t1.getFarbe());

	}

}
