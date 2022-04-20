package Loesungen;

public class _040_1_Array_rechnen {

	public static void main(String[] args) {
		int arrayEins[]= new int [5];
		arrayEins[0]=22;
		arrayEins[1]=2;
		arrayEins[2]=21;
		arrayEins[3]=18;
		arrayEins[4]=7;
		
		for (int i : arrayEins) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		arrayEins[2] = arrayEins[2] * arrayEins[1];
		System.out.println(arrayEins[2]);
		
		arrayEins[0] = arrayEins[0] / arrayEins[3];
		System.out.println(arrayEins[0]);
		
		if(arrayEins[2] % arrayEins[4] == 0) {
			System.out.println("\n5. Element ist Teiler des 3. Elements");
		} else System.out.println("5. Element ist kein Teiler des 3. Elements");
		
		
		for (int i : arrayEins) {
			System.out.print(i + " ");
		}
	}

}
