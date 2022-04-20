package Loesungen;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class _043_0_ArrayGroessAendern {

	public static void main(String[] args) {
		String[] arr = {"Hans", "Christian", "Lisa"};
		final int NEW_LENGTH = Integer.parseInt(JOptionPane.showInputDialog("Please enther the new length of the array"));
		
		
		String outputStr = "New Array: ";
		
		String[] tmpArr = Arrays.copyOf(arr, NEW_LENGTH);
		
		arr = tmpArr;
		
		int i = 0;
		for (String a : arr) {
			//Hier arr.length -1, weil arr.length die Anzahl der Elemente zurück gibt, wegen 0-Index müssen wir AnzahlElemente - 1 
			//nutzen um das LETZTE Element anzusprechen.
			//Ohne If würde das letzte Element ebenfalls mit Komma geschrieben werden 
			if(i++ == arr.length -1) {
				outputStr += a;
			}
			else outputStr += a + ", ";
		}
		
		JOptionPane.showMessageDialog(null, outputStr);
		
		

	}

}
