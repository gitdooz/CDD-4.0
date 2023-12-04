package Arrudeio;

public class Exercicio02 {

	public static void main(String[] args) {
		String str = "Hello";
		String resultado = str.replace('l', 'w');
		System.out.println(resultado);
		
		String str2 = "Hello World";
		String resultado2 = str2.substring(6);
		String resultado3 = str2.substring(3,8).toUpperCase();
		String resultado4 = str2.substring(0,6).trim();
		char r = str.charAt(0);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
		System.out.println(r);
	}

}
