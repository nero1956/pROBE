package Theorie._190_OOP._071_HAS_A_BeziehungExistenziellNew;

public class Autor {
	private String name;
	private int alter;
	private char geschlecht;
	
	Autor(String name, int alter, char geschlecht)  {
		this.name = name;
		this.alter = alter;
		this.geschlecht = geschlecht;
	}

	@Override
	public String toString() {
		return "Autor: " + this.getName() + ", Alter: " + this.getAlter() + ", Geschlecht: " + this.getGeschlecht();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}
}
