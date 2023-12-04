package Arrudeio;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um texto: ");
		String texto = input.nextLine();
		String resposta = texto.toUpperCase();
		
		System.out.println(resposta);
		input.close();
	}

}
