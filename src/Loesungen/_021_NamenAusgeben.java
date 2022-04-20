package Loesungen;

import javax.swing.JOptionPane;

public class _021_NamenAusgeben {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Bitte geben Sie Ihren Namen ein");
		int anzahl = Integer.parseInt(JOptionPane.showInputDialog("Wie oft soll der Name wiederholt "
										+ "ausgegeben werden? Max. 30 mal möglich"));
		int zaehler = 1;
		
		String ausgabe = ""; 
		
		final int MENGE_OBERE_GRENZE = 30;
		final int MENGE_UNTERE_GRENZE = 0;
		
		if (anzahl > MENGE_UNTERE_GRENZE && anzahl <= MENGE_OBERE_GRENZE) {
			
			while (zaehler <= anzahl) {
				ausgabe += "\n" + zaehler + ": " + name;
				zaehler++;
			}
			JOptionPane.showMessageDialog(null, ausgabe);
		} else {
			JOptionPane.showMessageDialog(null, "Ihre Zahl ist zu klein oder zu groß");
		}
		
		

	}

}
