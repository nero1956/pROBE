package Loesungen;

import javax.swing.JOptionPane;

public class _043_1_ArrayGroesseAendern {

	public static void main(String[] args) {
		String[] arr = {"Hans", "Christian", "Lisa"};
		final int USR_AMOUNT = Integer.parseInt(JOptionPane.showInputDialog("Please enther the amount by wich "
				+ "the array should be increased"));
		
		String[] tmpArr = new String[arr.length + USR_AMOUNT];
		
		for (int i = 0; i < arr.length; i++) {
			tmpArr[i] = arr[i];
		}
		
		arr = tmpArr;
		
		String outputStr = "New Array: ";
		
		for(int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1 ) {
				outputStr += arr[i];
			}
			else {
				outputStr += arr[i] + ", ";
			}
			
		}
		
		JOptionPane.showMessageDialog(null, outputStr);

	}

}
