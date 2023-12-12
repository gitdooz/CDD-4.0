package Desafio01;

public class Veiculos {
	private static int ultimoId = 0;
	
	private int idVeiculo;
	String nome;
	String modelo;
	double preco;
	
	public Veiculos(String nome, String modelo, double preco) {
		this.idVeiculo = ++ultimoId;
		this.nome = nome;
		this.modelo = modelo;
		this.preco = preco;
	}
}
