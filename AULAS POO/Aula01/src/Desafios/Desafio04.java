package Desafios;

import java.util.Scanner;

public class Desafio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um n�mero de um 1 a 7: ");
		int dia = input.nextInt();
		
		if(dia == 1) {
			System.out.println("Hoje � domingo.");
		}
		
		else if(dia == 2) {
			System.out.println("Hoje � segunda.");
		}
		else if(dia == 3) {
			System.out.println("Hoje � ter�a.");
		}
		else if(dia == 4) {
			System.out.println("Hoje � quarta.");
		}
		else if(dia == 5) {
			System.out.println("Hoje � quinta.");
		}
		
		else if(dia == 6) {
			System.out.println("Hoje � sexa.");
		}
		else if(dia == 7) {
			System.out.println("Hoje � s�bado.");
		}
		else {
			System.out.println("Valor Inv�lido!");
		}
		
		input.close();
	}
}
