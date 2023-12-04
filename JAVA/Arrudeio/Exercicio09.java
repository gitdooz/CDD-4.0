package Arrudeio;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		String texto = input.nextLine();
		StringTokenizer quantPalavras = new StringTokenizer(texto);
		
		System.out.print("A quantidade de palavras é: " + quantPalavras.countTokens());
		input.close();
	}

}
