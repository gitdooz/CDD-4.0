package JavaPOO;

public class Carro {
	String cor;
	double preco;
	String modelo;
	//encapsulamento do private significa proteger 
	public Carro() {
		
	}
	
	public Carro(double preco, String modelo) {
		this.cor = "PRETO";
		this.preco = preco;
		this.modelo = modelo;
	}
	
	public Carro(String cor, String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public double getPreco() {
		return preco;
	}

	public String getModelo() {
		return modelo;
	}
}
