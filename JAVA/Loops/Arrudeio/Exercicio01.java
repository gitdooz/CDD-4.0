package Arrudeio;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//63, 50, 113
		
		double soma = 0,soma2 = 0;
		
		for(int i = 1; i <= 20; i++) {
			System.out.print("Escreva um número: ");
			int numero = input.nextInt();
			
			if(numero % 3 == 0) {
				soma = numero + soma;
			}
			if(numero % 5 == 0) {
				soma2 = numero + soma2;
			}
		}
		
		double total = soma + soma2;
		
		System.out.println("Soma dos números múltiplos de 3: " + soma);
		System.out.println("Soma dos números múltiplos de 5: " + soma2);
		System.out.print("Soma dos números múltiplos de 3 e 5: " + total);
		
		
		input.close();
	}
}
