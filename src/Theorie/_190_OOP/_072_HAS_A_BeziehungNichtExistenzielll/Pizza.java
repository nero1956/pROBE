package Theorie._190_OOP._072_HAS_A_BeziehungNichtExistenzielll;

public class Pizza {
	private String typ;
	private int durchmesser;
	private Tomate tom;
	
	Pizza(String typ, int durchmesser, Tomate tom) {
		this.typ = typ;
		this.durchmesser = durchmesser;
		this.tom = tom;
	}
	
	@Override
	public String toString() {
		return "Pizza Typ: " + typ + ", Durchmesser: " + durchmesser + "cm";
	}

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

	public Tomate getTom() {
		return tom;
	}

	public void setTom(Tomate tom) {
		this.tom = tom;
	}
}
