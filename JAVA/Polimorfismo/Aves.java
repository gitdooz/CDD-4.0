package Polimorfismo;

public class Aves extends Animal{
	
	boolean voa;
	boolean penas;
	String cor;
	
	public Aves(String nome, String especie, boolean penas, int cor) {
	super(nome, especie);
		this.voa = true;
		this.penas = penas;
	}
}
