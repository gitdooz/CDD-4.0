package Polimorfismo;

public class Mamiferos extends Animal{
	
	boolean pelos;
	boolean glandulasMamarias;
	String cor;
	
	public Mamiferos(String nome, String especie, boolean pelos, String cor) {
		super(nome, especie);
		this.pelos = true;
		this.glandulasMamarias = true;
	}
}
