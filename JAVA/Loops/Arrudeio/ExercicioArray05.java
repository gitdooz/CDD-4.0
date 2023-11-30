package Arrudeio;
import java.util.Scanner;

public class ExercicioArray05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double notas[] = new double[5];
		double soma = 0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do " + (i+1) + "º aluno: ");
			notas[i] = input.nextDouble();
			soma = notas[i] + soma;
		}
		
		double media = soma/5;
		System.out.println("Média dos alunos: " + media);
		
		input.close();
	}

}
