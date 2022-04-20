package Theorie;

import java.util.Arrays;

public class _350_Gleichheit {

	public static void main(String[] args) {
		//Zwei primitive Datentypen (int) auf Gleichheit prüfen
		//Datentyp float und double sollten nicht auf Gleichheit geprüft werden wegen Rundungsfehlern, bitte Reichweite testen
		
		int int1 = 10;
		int int2 = 10;
		int int3 = 12;
		
		System.out.println(int1 == int2); //true
		System.out.println(int1 == int3); //false
		
//		Zwei String (Objekte) auf Gleichheit prüfen
		String str1 = "Hans";
		String str2 = "Hans";
		
		String str3 = new String("Hans");
		String str4 = new String("Hans");

		System.out.println(str1 == str2); 		//true
		System.out.println(str1 == str3); 		//false
		System.out.println(str1.equals(str3)); 	//true
		System.out.println(str3 == str4);		//false
		System.out.println(str3.equals(str4));	//true
		
		
//		Zwei Arrays auf Gleichheit prüfen
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3 = {2,1,3};
		int[] arr4 = arr1;
		
		System.out.println(arr1 == arr2); 				//false
		System.out.println(arr1 == arr4); 				//true;

		System.out.println(arr1.equals(arr2)); 			//false;
		System.out.println(Arrays.equals(arr1, arr2));	//true;
		System.out.println(Arrays.equals(arr1, arr3));  //false;
		
		
		
	}

}
