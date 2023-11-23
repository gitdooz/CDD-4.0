package ATTS;
import java.util.Scanner;

public class Desafio06 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int cont = 0;
			System.out.println("--- RESPONDA DA SEGUINTE FORMA ----\n"
					+ "--- 1 para 'NÃO' ---\n"
					+ "--- 2 para 'SIM' ---");
			System.out.print("Telefonou para a vítima? ");
			int opcao1 = input.nextInt();
			if(opcao1 == 2){
				++cont;
			}

			System.out.print("Esteve no local do crime? ");
			int opcao2 = input.nextInt();
			if(opcao2 == 2) {
				++cont;
			}
			
			System.out.print("Mora perto da vítima? ");
			int opcao3 = input.nextInt();
			if(opcao3 == 2) {
				++cont;
			}
			
			System.out.print("Devia para a vítima? ");
			int opcao4 = input.nextInt();
			if(opcao4 == 2) {
				++cont;
			}

			System.out.print("Já trabalhou com a vítima? ");
			int opcao5 = input.nextInt();
			if(opcao5 == 2) {
				++cont;
			}
			
			if(cont == 2) {
				System.out.println("--- PESSOA SUSPEITA ---");
			}
			
			else if(cont == 3 || cont == 4) {
				System.out.println("--- PESSOA CÚMPLICE ---");
			}
			
			else if(cont == 5) {
				System.out.println("--- PESSOA ASSASSINA ---");
			}
			
			else if(cont < 2) {
				System.out.println("--- INOCENTE ---");
			}
			
			input.close();
		}
}
