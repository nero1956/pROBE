package Theorie._190_OOP._072_HAS_A_BeziehungNichtExistenzielll;

public class Tomate extends Gemuese {
	private String farbe;
	
	Tomate(String farbe) {
		this.farbe = farbe;
	}

	@Override
	public String toString() {
		return this.farbe;
	}
	
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
}
