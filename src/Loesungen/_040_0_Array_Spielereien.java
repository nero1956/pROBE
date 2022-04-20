package Loesungen;

import java.util.Arrays;

public class _040_0_Array_Spielereien {

	public static void main(String[] args) {
		
		//Aufgabe1
		int[] arr1 = new int[5];
		arr1[0] = 5; 
		arr1[1] = 3; 
		arr1[2] = 5; 
		arr1[3] = 17; 
		arr1[4] = 12;
		
		//Aufgabe2
		System.out.println("arr1[2]: " + arr1[2] + " arr1[4] " + arr1[4]);
		
		//Aufgabe3
		System.out.println("arr1[3] vor Änderung: " + arr1[3]);
		arr1[3] = 29;
		System.out.println("arr1[3] nach Änderung: " + arr1[3]);
		
		//Aufgabe4
		int[] arr2 = {5,4,5,17,12};
		
		//Aufgabe5
		System.out.print("Ausgabe arr2 mit for-Schleife: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		//Aufgabe6
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = 0;
		}
		
		System.out.println();
		System.out.print("Ausgabe arr2 mit 0 überschrieben: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		
		//Aufgabe 7
		int[] arr3 = new int[5];
		Arrays.fill(arr3, 5);

		System.out.println();
		System.out.print("Ausgabe des arr3 mit 5 gefüllt: ");		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		//Aufgabe 8
		int[] arr4 = {3, 12, 9};
		Arrays.sort(arr4);
		
		System.out.println();
		System.out.print("Sortiertes arr4: ");
		for(int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		
		
		//Aufgabe 9
		System.out.println();
		String[] arr5= {"Hans", "Werner", "Dieter"};
		
		Arrays.sort(arr5);
		
		int resultIndex = Arrays.binarySearch(arr5, "Hans");
		System.out.println("Gefunder Index: " + resultIndex);
		
		if(resultIndex > 0) {
			System.out.println("Wert gefunden. An Position: " + resultIndex );
		} else System.out.println("Wert nicht gefunden.");
		
		
		//Aufgabe 10
		String[] arr6= {"Hans", "Werner", "Dieter"};
		System.out.println("Array vor Sortierung gleich? " + Arrays.equals(arr5, arr6));
		
		Arrays.sort(arr6);
		
		System.out.println("Array nach Sortierung gleich? " + Arrays.equals(arr5, arr6));
		
		
		//Aufgabe 11
		System.out.print("Ausgabe arr1 mit for-each: ");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("Ausgabe arr5 mit for-each: ");
		for (String s : arr5) {
			System.out.print(s + " ");
		}
	}
}
