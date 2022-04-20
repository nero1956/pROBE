package Theorie._190_OOP._070_IS_A_BeziehungNew;

public class Mahlzeit {
	private int kcal;
	private int menge;
	
	Mahlzeit () {}
	
	Mahlzeit(int kcal, int menge) {
		this.kcal = kcal;
		this.menge = menge;
	}
	
	@Override
	public String toString() {
		return "Ich bin eine Mahlzeit";
	}
	
	
	//Getter & Setter
	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}
	
	
}
