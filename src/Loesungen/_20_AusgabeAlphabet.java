package Loesungen;

import javax.swing.JOptionPane;

public class _20_AusgabeAlphabet {

	public static void main(String[] args) {
		String ausgabe = "";
		
		for (int i = 65; i <= 90; i++) {
			ausgabe += (char)i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, ausgabe);

	}

}
