package Theorie._190_OOP._070_IS_A_BeziehungNew;

public class Pizza extends Mahlzeit {
	private String typ;
	private int durchmesser;
	
	Pizza() {
		super(266,150); // Aufruf des Elternklassen - Konstruktors. MUSS immer an erster Stelle nach der geöffneten, geschweiften Klammer
						// stehen. Klasse Pizza hat durch Vererbung Elemente der Elternklasse geerbt
		
		// kcal = 250;  // Compiler Error: kcal ist not visible, wegen private in SuperKlasse (Elternklasse). Mit setter könnte der geschrieben werden
		
		setTyp("Salami");
		setDurchmesser(35);
	}
	
	Pizza(int kcal, int menge) {
	//	super();		//super() wird implizit aufgerufen, wenn der Entwickler es nicht selbst schreibt
		
		setKcal(280);
		setMenge(160);
		
		setTyp("Salami");
		setDurchmesser(35);
		
	}
	
	Pizza(int kcal, int menge, String typ, int durchmesser) {
		super(kcal, menge);
		
		setTyp(typ);
		setDurchmesser(durchmesser);
	}
	
//	@Override
//	public String toString() {
//		return "Ich bin eine Pizza";
//	}
	

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getDurchmesser() {
		return durchmesser;
	}

	public void setDurchmesser(int durchmesser) {
		this.durchmesser = durchmesser;
	}
}
