package Arrudeio;
import java.util.Scanner;

public class ExercicioArray04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arrayA[] = new int[10];
		int arrayB[] = new int[10];
		int arrayC[] = new int[10];
		int arrayD[] = new int[10];
		
		for(int a = 0; a < arrayA.length; a++) {
			System.out.print("Digite o número para o ArrayA: ");
			arrayA[a] = input.nextInt();
		}
		
		System.out.println();
		
		for(int b=0; b < arrayB.length; b++) {
			System.out.print("Digite o número para o ArrayB: ");
			arrayB[b] = input.nextInt();
		}
		System.out.println();
		
		for(int c = 0; c < arrayC.length; c++) {
			System.out.print("Digite o número para o ArrayC: ");
			arrayC[c] = input.nextInt();
		}
		System.out.println();
		for(int d = 0 ; d < arrayD.length; d++) {
			System.out.print("Digite o número para o ArrayD: ");
			arrayD[d] = input.nextInt();
		}
		
		System.out.println(); 
		System.out.println("--- Componentes do ArrayA ---");
		for(int x : arrayA) {
			System.out.print(arrayA[x] + " ");
		}
		
		System.out.println();
		System.out.println("--- Componentes do ArrayB ---");
		for(int y : arrayB) {
			System.out.print(arrayB[y] + " ");
		}
		
		System.out.println();
		System.out.println("--- Componentes do ArrayC ---");
		for(int w : arrayC) {
			System.out.print(arrayC[w] + " ");
		}
		
		System.out.println();
		System.out.println("--- Componentes do ArrayD ---");
		for(int z : arrayD) {
			System.out.print(arrayD[z] + " ");
		}
		
		input.close();
	}

}
