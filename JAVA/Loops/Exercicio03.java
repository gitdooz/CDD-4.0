package Loops;

public class Exercicio03 {
	public static void main(String[] args) {
		System.out.println("--- Números pares de 1 a 100 ---");
		
		int numero = 0;
		while(numero < 100) {
			++numero;
			if(numero % 2 != 1) {
				System.out.println(numero + " ");
			}
		}
	}
}
