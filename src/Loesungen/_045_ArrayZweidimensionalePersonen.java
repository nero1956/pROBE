package Loesungen;

import javax.swing.JOptionPane;

public class _045_ArrayZweidimensionalePersonen {

	public static void main(String[] args) {
		String[][] persons = {
				{"Hans", "Werner", "48", "ledig", "Handwerker"}, 
				{"Christian", "Herrero" , "30", "verheiratet", "Bankaufmann"},				
				{"Elif", "Yamaz", "8", "ledig", "Schülerin"},
				{null, null, null, null, null},				
				};

		String[] categories = {"Vorname", "Nachname", "Alter", "Familienstand", "Beruf"};
		
		int includeIndex = -1;
		int amountNull = 0;
		
		
		
		for (int i = 0; i < persons.length && includeIndex == -1; i++) {
			for (int j = 0; j < persons[i].length && includeIndex == -1; j++) {
				if (persons[i][j] == null) amountNull++;
				if (amountNull == categories.length) {
					includeIndex = i;
				}
			}
			amountNull = 0;
		}
		
		
		String input = " ";
		if(includeIndex >= 0) {
			for (int j = 0; j < categories.length; j++) {
				input = JOptionPane.showInputDialog(categories[j] + ": ");
				if (input.isEmpty()) {
					input = null;
				}
				persons[includeIndex][j] = input;
			}
		}
		
		String output = "";
		
		for (int i = 0; i < categories.length; i++) {
			output += categories[i] + " ";
		} output += "\n\n";
		
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				output += persons[i][j] + " ";
			}
			output += "\n";
		}
		
		JOptionPane.showMessageDialog(null, output);

	}

}
