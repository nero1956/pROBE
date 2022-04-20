package Theorie._190_OOP._071_HAS_A_BeziehungExistenziellNew;

public class Buchhandlung {

	public static void main(String[] args) {
		// Für das Buch benötigen einen Autor
		Autor meinAutor = new Autor("Luise France", 38, 'f');
		System.out.println(meinAutor.toString());
		
		Buch meinBuch = new Buch("Gefangen auf Zugspitze", meinAutor, 33.50);
		System.out.println(meinBuch.toString());

	}

}
