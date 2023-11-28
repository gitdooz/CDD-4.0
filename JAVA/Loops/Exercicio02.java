package Loops;

public class Exercicio02 {
	public static void main(String[] args) {
		System.out.println("--- Números ímpares de 1 a 100 ---");
	
		int numero = 0;
		while(numero < 100) {
			++numero;
			if(numero % 2 != 0) {
				System.out.println(numero + " ");
			}
		}
	}
}
