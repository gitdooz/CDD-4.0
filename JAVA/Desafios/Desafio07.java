package Desafios;
import java.util.Scanner;
//
public class Desafio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contSim = 0;
		System.out.println("--- RESPONDA DA SEGUINTE FORMA ----\n"
				+ "--- 1 para 'NÃO' ---\n"
				+ "--- 2 para 'SIM' ---");
		System.out.print("Telefonou para a vítima? ");
		int opcao1 = input.nextInt();
		if(opcao1 == 2){
			++contSim;
		}
		
		System.out.print("Esteve no local do crime? ");
		int opcao2 = input.nextInt();
		if(opcao2 == 2) {
			++contSim;
		}
		
		System.out.print("Mora perto da vítima? ");
		int opcao3 = input.nextInt();
		if(opcao3 == 2) {
			++contSim;
		}
		
		System.out.print("Devia para a vítima? ");
		int opcao4 = input.nextInt();
		if(opcao4 == 2) {
			++contSim;
		}
		
		System.out.print("Já trabalhou com a vítima? ");
		int opcao5 = input.nextInt();
		if(opcao5 == 2) {
			++contSim;
		}

		if(contSim == 2) {
			System.out.println("--- PESSOA SUSPEITA ---");
		}
		
		else if(contSim == 3 || contSim == 4) {
			System.out.println("--- PESSOA CÚMPLICE ---");
		}
		
		else if(contSim == 5) {
			System.out.println("--- PESSOA ASSASSINA ---");
		}
		
		else if(contSim < 2) {
			System.out.println("--- INOCENTE ---");
		}
	}
}
