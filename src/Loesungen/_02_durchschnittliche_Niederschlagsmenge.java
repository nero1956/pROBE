package Loesungen;

import javax.swing.JOptionPane;

public class _02_durchschnittliche_Niederschlagsmenge {
	
	

	public static void main(String[] args) {
		
		final int ANZAHL_MONATE = 3;
		
		double april = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die durchschnittliche Niederschlagsmenge vom April an: "));
		double mai = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die durchschnittliche Niederschlagsmenge vom Mai an: "));
		double juni = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die durchschnittliche Niederschlagsmenge vom Juni an: "));
		
		double durchschnittNiederschlag = (april + mai + juni) / ANZAHL_MONATE;
		
		JOptionPane.showMessageDialog(null, "Die Niederschlagsmenge f�r April ist: " + april + " l/qm" + "\n"
										   +"Die Niederschlagsmenge f�r Mai ist: " + mai + " l/qm" + "\n"
				                           +"Die Niederschlagsmenge f�r Juni ist: " + juni + " l/qm" + "\n\n" 
										   +"Die durchschnittliche Niederschlagsmenge betraegt: " + durchschnittNiederschlag + "l/qm");
	}
}
