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
		
		System.out.print("1� soma: "+ soma1 + "\n2� soma: "+ soma2+ 
				"\n1� multiplica��o: "+ multip + 
				"\n2� multiplica��o: " + multip2 + 
				"\n1� subtra��o: "+ subt + 
				"\n2� subtra��o: "+ subt2);
	}
}
