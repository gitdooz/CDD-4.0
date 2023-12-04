package Arrudeio;

public class Exercicio03 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		//o equalsIgnoreCase testa se as strings são iguais, ignorando o caps lock
		System.out.println(s1 + " " + s2 + " " + b1 + " " + b1 + " "+ b2 + " " + b3 + " " + b4 + ".");
	}
}
