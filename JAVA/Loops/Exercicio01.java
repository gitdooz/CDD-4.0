package Loops;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cont = 0;
		System.out.print("Insira a quantidade de alunos da sua sala: ");
		int quantAlunos = input.nextInt();
		
		double nota = 0;
		double soma = 0;
		
		while(cont < quantAlunos) {
			++cont;
			System.out.print("Digite a " + cont + "ª nota: ");
			nota = input.nextDouble();
			soma = nota + soma;
		}
		
		double media = soma/quantAlunos;
		
		System.out.println("A média aritmética da sala é " + media);
		input.close();
	}
}
