package Loesungen;

import javax.swing.JOptionPane;

public class _031_Disco_Einlass {

	public static void main(String[] args) {
//		String istAltGenug = JOptionPane.showInputDialog("Bist du 18 oder ‰lter?");
//		istAltGenug = istAltGenug.toLowerCase();
		
		String istAltGenug = JOptionPane.showInputDialog("Bist du 18 oder ‰lter?").toLowerCase();
		
		if(istAltGenug.equals("ja")) {
			String istVIP = JOptionPane.showInputDialog("Bist du ein VIP?").toLowerCase();
			String istFrau = JOptionPane.showInputDialog("Bist du eine Frau?").toLowerCase();
			
			if(istVIP.equals("ja") && istFrau.equals("ja")) {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unserer Disco! Viel Spaﬂ in der VIP - Lounge. "
						+ "Heute ist Ladies Night. Du bekommst 15% Rabatt auf alle Getr‰nke.");
			} else if (istVIP.equals("ja")) {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unserer Disco! Viel Spaﬂ in der VIP - Lounge.");
			} else if (istFrau.equals("ja")) {
				JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unserer Disco! Heute ist Ladies - Night. "
						+ "Es gibt 15% Rabatt.");		
			} else JOptionPane.showMessageDialog(null, "Herzlich Willkommen in unserer Disco!");
		} else JOptionPane.showMessageDialog(null, "Leider bist du zu jung. Machs gut.");
	}
}
