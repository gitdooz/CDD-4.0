package Loops;
import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreva um número: ");
		int numero = input.nextInt();
					
		if(numero % 2 == 0) {
			numero = numero/2;
			System.out.print("Número: " + numero);
		}
		
		else {
			numero = 3 * numero + 1;
			System.out.print("Número: " + numero);
		}
	}

}
