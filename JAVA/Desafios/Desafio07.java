package Desafios;
import java.util.Scanner;
//
public class Desafio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contSim = 0;
		System.out.println("--- RESPONDA DA SEGUINTE FORMA ----\n"
				+ "--- 1 para 'N�O' ---\n"
				+ "--- 2 para 'SIM' ---");
		System.out.print("Telefonou para a v�tima? ");
		int opcao1 = input.nextInt();
		if(opcao1 == 2){
			++contSim;
		}
		
		System.out.print("Esteve no local do crime? ");
		int opcao2 = input.nextInt();
		if(opcao2 == 2) {
			++contSim;
		}
		
		System.out.print("Mora perto da v�tima? ");
		int opcao3 = input.nextInt();
		if(opcao3 == 2) {
			++contSim;
		}
		
		System.out.print("Devia para a v�tima? ");
		int opcao4 = input.nextInt();
		if(opcao4 == 2) {
			++contSim;
		}
		
		System.out.print("J� trabalhou com a v�tima? ");
		int opcao5 = input.nextInt();
		if(opcao5 == 2) {
			++contSim;
		}

		if(contSim == 2) {
			System.out.println("--- PESSOA SUSPEITA ---");
		}
		
		else if(contSim == 3 || contSim == 4) {
			System.out.println("--- PESSOA C�MPLICE ---");
		}
		
		else if(contSim == 5) {
			System.out.println("--- PESSOA ASSASSINA ---");
		}
		
		else if(contSim < 2) {
			System.out.println("--- INOCENTE ---");
		}
	}
}
