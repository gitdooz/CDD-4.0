package Desafios;

import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor qualquer: ");
		double valor = input.nextDouble();
		
		System.out.print(valor == 0 ? "O numero eh neutro." : valor < 0 ? "O numero eh negativo." : "O numero eh positivo.");
		
		input.close();
	}
}
