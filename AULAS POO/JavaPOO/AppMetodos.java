package JavaPOO;

public class AppMetodos {

	public static void main(String[] args) {
		JavaMetodos pessoa = new JavaMetodos();
		
		String nome = pessoa.nome();
		int idade = pessoa.idade();
		boolean estado = pessoa.estado();
		double valor = pessoa.valor();
		
		System.out.print("Nome: " + nome+ "\nIdade: "+ idade +"\nEstado: "+ estado +"\nValor: "+ valor);
	}
}
