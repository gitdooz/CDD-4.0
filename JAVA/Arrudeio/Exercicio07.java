package Arrudeio;
import java.util.StringTokenizer;
public class Exercicio07 {

	public static void main(String[] args) {
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
		System.out.println(exemplo.countTokens());
		//o countTokens conta a quantidade de palavras da frase;
	}
}
