package Desafios;

import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o 1� n�mero: ");
		float n1 = input.nextFloat();
		
		System.out.print("Digite o 2� n�mero: ");
		float n2 = input.nextFloat();
		
		System.out.print("Digite o 3� n�mero: ");
		float n3 = input.nextFloat();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O n�mero " + n1 + " , que � o primeiro, � o maior.");
			if(n2 < n3) {
				System.out.println("E o n�mero " + n2 + " , que � o segundo, � o menor");
			}
			else {
				System.out.println("E o n�mero " + n3 + " , que � o terceiro, � o menor");
			}
		}
		
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O n�mero " + n2 + " , que � o segundo, � o maior.");
			if(n1 < n3) {
				System.out.println("E o n�mero " + n1 + " , que � o primeiro, � o menor");
			}
			else {
				System.out.println("E o n�mero " + n3 + " , que � o terceiro, � o menor");
			}
		}
		
		else if(n3 > n1 && n3 > n2) {
			System.out.println("O n�mero " + n3 + " que � o terceiro, � o maior.");
			if(n1 < n2) {
				System.out.println("E o n�mero " + n1 + " , que � o primeiro, � o menor");
			}
			else {
				System.out.println("E o n�mero " + n2 + " , que � o segundo, � o menor");
			}
		}
		
		else if(n1 == n2 && n2 == n3) {
			System.out.println("Os n�meros s�o iguais.");
		}
		input.close();
	}
}
