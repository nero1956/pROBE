package Theorie;

public class _390_Array {

	public static void main(String[] args) {
		
		int[] values1;
		values1 = new int[3];
		
		int[] values2 = new int[3];
		values2[0] = 2;
		
		//Weniger verbeitete Variante
		int values3[] = new int[3];
		
		//Array Literal - lange Schreibweise
		double[] values4 = new double[] {2.1, 3.5, 20.3};
		
		//Array als Array - Literal deklarieren
		double[] values5 = {2.1, 3.5, 20.3};
		
		System.out.println(values1);
		
		//Array befüllen
		values1[0] = 2;
		values1[1] = 5;
		values1[2] = 1;
//		values1[3] = 4;						//Fehler ArrayIndexOutOfBoundsException
		
//		System.out.println(values1[3]);		//Fehler ArrayIndexOutOfBoundsException
		
		//Länge des Arrays ausgeben
		System.out.println(values1.length);
		
		for (int i = 0; i < values1.length; i++) {
			System.out.print(values1[i] + " ");
		}
		
		System.out.println();
		
		//For-Each Ausgabe
		for (int i : values1) {
			System.out.print(i + " ");
		}
		
		
		//Multidimensionales Array
		int[][] values6= new int[3][4];
		
		
		System.out.println();
		System.out.println("Ausgabe multidimensionales Array mit for-each (enhanced-for-loop)");
		//Ausgabe multidimensionales Array mit ForEach
		for (int[] i : values6) {
			for (int j : i) {
				System.out.print(j + " ");
			}System.out.println();
		}
		
		System.out.println();
		System.out.println("Ausgabe multidimensionales Array mit for-loop");
		for (int i = 0; i < values6.length; i++) {
			for (int j = 0; j < values6[i].length; j++) {
				System.out.print(values6[i][j] + " ");
			}System.out.println();
		}
	}
}
