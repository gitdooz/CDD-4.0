package JavaPOO;

public class Calculadora {

	public static void main(String[] args) {
		SomarMetodos somas = new SomarMetodos();
		Multiplicar multiplicar = new Multiplicar();
		Subtrair subtrair = new Subtrair();
		
		int soma1 = somas.somar(5, 9);
		int soma2 = somas.somar(9, 10, 11);
		double multip = multiplicar.multiplicacao(9, 10);
		double multip2 = multiplicar.multiplicacao(10, 5, 2);
		int subt = subtrair.subtracao(20, 10);
		int subt2 = subtrair.subtracao(30, 4, 5);
		
		System.out.print("1ª soma: "+ soma1 + "\n2ª soma: "+ soma2+ 
				"\n1ª multiplicação: "+ multip + 
				"\n2ª multiplicação: " + multip2 + 
				"\n1º subtração: "+ subt + 
				"\n2ª subtração: "+ subt2);
	}
}
