package Desafios;

import java.util.Scanner;

public class Desafio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a 1� nota: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Digite a 2� nota: ");
		double nota2 = input.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media >=7){
			System.out.print("Aluno est� aprovado! M�dia: " + media);
		}
		
		else if(media >= 4) {
			System.out.print("Aluno est� de recupera��o! M�dia: " + media);
		}
		
		else {
			System.out.print("Aluno est� reprovado! M�dia: " + media);
		}
		
		input.close();
	}
}
