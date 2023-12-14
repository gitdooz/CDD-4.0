package Polimorfismo;

public class Animal {
	String nome;
	String especie;
	boolean come;
	boolean fazBarulho;
	boolean anda;
	boolean caga;
	
	public Animal(String especie, String nome) {
		this.nome = nome;
		this.especie = especie;
		this.come = false;
		this.fazBarulho = false;
		this.anda = false;
		this.caga = false;
	}
	
}
