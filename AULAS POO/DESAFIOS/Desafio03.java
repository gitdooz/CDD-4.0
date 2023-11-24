package DESAFIOS;
import java.util.Scanner;

public class Desafio03 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Digite um número de um 1 a 7: ");
			int dia = input.nextInt();
			
			if(dia == 1) {
				System.out.println("Hoje é domingo.");
			}
			
			else if(dia == 2) {
				System.out.println("Hoje é segunda.");
			}
			else if(dia == 3) {
				System.out.println("Hoje é terça.");
			}
			else if(dia == 4) {
				System.out.println("Hoje é quarta.");
			}
			else if(dia == 5) {
				System.out.println("Hoje é quinta.");
			}
			
			else if(dia == 6) {
				System.out.println("Hoje é sexa.");
			}
			else if(dia == 7) {
				System.out.println("Hoje é sábado.");
			}
			else {
				System.out.println("Valor Inválido!");
			}
			
			input.close();
		}
}
