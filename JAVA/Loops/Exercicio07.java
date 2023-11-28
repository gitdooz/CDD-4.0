package Loops;

public class Exercicio07 {

	public static void main(String[] args) {
		for(int i = 0; i<100; i++) {
			if(i > 50 && i <60) {
				continue; //ele não mostra os números de 50 a 60
			}
		System.out.println(i);
		}

	}

}
