package Loops;

public class Exercicio12 {

	public static void main(String[] args) {
		int cont = 0;

		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				++cont;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nQuantidade de númmeros múltiplos de 3 é " + cont);
	}
}
