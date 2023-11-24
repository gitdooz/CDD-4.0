package DESAFIOS;
import java.util.Scanner;

public class Desafio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a 1ª nota: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Digite a 2ª nota: ");
		double nota2 = input.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media >=7){
			System.out.print("Aluno está aprovado! Média: " + media);
		}
		
		else if(media >= 4) {
			System.out.print("Aluno está de recuperação! Média: " + media);
		}
		
		else {
			System.out.print("Aluno está reprovado! Média: " + media);
		}
		
		input.close();
	}
}
