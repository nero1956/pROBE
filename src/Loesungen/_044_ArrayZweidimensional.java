package Loesungen;

public class _044_ArrayZweidimensional {

	public static void main(String[] args) {
		int[][] arr = {
				{1, 8, 9},
				{4, 2, 10},
				{2, 2, 8}
				};
		
		for (int[] i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
