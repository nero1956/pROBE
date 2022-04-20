package Loesungen;

import javax.swing.JOptionPane;

public class _042_ArrayNotendurchschnitt {

	public static void main(String[] args) {
		double summe = 0;
		int anzahlNoten = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die exakte Anzahl der Noten ein: "));
		double[] arrNoten = new double[anzahlNoten];
		String ausgabeNoten = "Ihre eingegeben Noten sind: ";
		
		for (int i = 0; i < anzahlNoten; i++) {
			arrNoten[i] = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie Ihre " + (i + 1) + ". Note ein: "));
			summe += arrNoten[i];
		}
		
		for (int i = 0; i < anzahlNoten; i++) {
			if (i == anzahlNoten - 1) ausgabeNoten += arrNoten[i];
			else ausgabeNoten += arrNoten[i] + ", ";
		}
		
		JOptionPane.showMessageDialog(null, ausgabeNoten + "\nIhr Notendurchschnitt beträgt: "
								+ String.format("%.2f", summe / anzahlNoten));

	}

}
