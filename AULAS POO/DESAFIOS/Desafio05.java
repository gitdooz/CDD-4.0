package DESAFIOS;
import java.util.Scanner;
public class Desafio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		char letra = input.nextLine().charAt(0);
		
		if(letra == 'F') {
			System.out.println("F - Feminino.");
		}
		
		else if(letra == 'M') {
			System.out.println("M - Masculino.");
		}
		
		else {
			System.out.println("Letra inválida!");
		}
		
		input.close();

	}

}
