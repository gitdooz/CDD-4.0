package Desafios;
import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor qualquer: ");
		double valor = input.nextDouble();
		
		if(valor > 0) {
			System.out.print("\nO numero " + valor + " eh positivo.");
		}
		else {
			System.out.print("\nO numero " + valor + " eh negativo.");
		}
		
		input.close();
	}
}
