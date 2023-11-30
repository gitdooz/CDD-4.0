package Arrudeio;

public class ExercicioArray01 {
	public static void main(String[] args) {
		int intArray[] = { 2, 5, 46, 12, 34};
		
		for(int i = 0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		for(int x = 4; x >= 0; x--) {
			System.out.print(intArray[x] + " ");
		}
	}
}
