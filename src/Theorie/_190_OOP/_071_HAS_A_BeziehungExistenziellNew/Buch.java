package Theorie._190_OOP._071_HAS_A_BeziehungExistenziellNew;

public class Buch {
	private String titel;
	private Autor autor;
	private double preis;
	
	Buch(String titel, Autor autor, double preis) {
		this.titel = titel;
		this.autor = autor;
		this.preis = preis;
	}
	
	@Override
	public String toString() {
		return "Buchtitel: " + this.getTitel() + "\n" + autor.toString() + "\nPreis: " + String.format("%.2f", this.getPreis()) + "€";
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
}
