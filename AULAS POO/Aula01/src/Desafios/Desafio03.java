package Desafios;

import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		float n1 = input.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		float n2 = input.nextFloat();
		
		System.out.print("Digite o 3º número: ");
		float n3 = input.nextFloat();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O número " + n1 + " , que é o primeiro, é o maior.");
			if(n2 < n3) {
				System.out.println("E o número " + n2 + " , que é o segundo, é o menor");
			}
			else {
				System.out.println("E o número " + n3 + " , que é o terceiro, é o menor");
			}
		}
		
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O número " + n2 + " , que é o segundo, é o maior.");
			if(n1 < n3) {
				System.out.println("E o número " + n1 + " , que é o primeiro, é o menor");
			}
			else {
				System.out.println("E o número " + n3 + " , que é o terceiro, é o menor");
			}
		}
		
		else if(n3 > n1 && n3 > n2) {
			System.out.println("O número " + n3 + " que é o terceiro, é o maior.");
			if(n1 < n2) {
				System.out.println("E o número " + n1 + " , que é o primeiro, é o menor");
			}
			else {
				System.out.println("E o número " + n2 + " , que é o segundo, é o menor");
			}
		}
		
		else if(n1 == n2 && n2 == n3) {
			System.out.println("Os números são iguais.");
		}
		input.close();
	}
}
