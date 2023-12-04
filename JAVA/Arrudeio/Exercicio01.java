package Arrudeio;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int[5];
		int somas[] = new int[5];
		int multiplicacao[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite um número: ");	 
			numeros[i] = input.nextInt();
		}

		for(int g = 0; g< numeros.length; g++) {
			multiplicacao[g] = numeros[g] * 2;
		}
		
		System.out.println("Números 2x: ");
		for(int z : multiplicacao) {
			System.out.print(z+ " ");
		}
		
		for(int y = 0; y < numeros.length; y++) {
			somas[y] = numeros[y] + multiplicacao[y];
		}
		
		System.out.println("\nSoma: ");
		for(int j : somas) {
			System.out.print(j + " ");
		}
		
		input.close();

	}

}
