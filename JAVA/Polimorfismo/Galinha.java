package Polimorfismo;

public class Galinha extends Aves {
	String nome;
	String cor;
	public Galinha(String nome, String cor, String especie, int patas, boolean penas) {
		super(nome, penas, especie);
		this.nome = nome;
		this.cor = cor;
	}
	
	public String comer() {
		if(this.come == false) {
			this.come = true;
			return "Galinha está comendo.";
		}
		else {
			return "Galinha já está comendo.";
		}
	}
	
	public String pararDeComer() {
		if(this.come == true) {
			this.come = false;
			return "Galinha parou de comer.";
		}
		else {
			return "Galinha já parou de comer..";
		}
	}
	
	public String andar() {
		if(this.anda == false) {
			this.anda = true;
			return "Galinha está andando.";
		}
		else {
			return "Galinha já está andando.";
		}
	}
	
	public String pararDeAndar() {
		if(this.anda == true) {
			this.anda = false;
			return "Galinha está andando.";
		}
		else {
			return "Galinha já está andando.";
		}
	}
	
	public String cagar() {
		if(this.caga == false) {
			this.caga = true;
			return "Galinha está cagando.";
		}
		else {
			return "Galinha já está cagando.";
		}
	}
	
	public String pararDeCagar() {
		if(this.caga == true) {
			this.caga = false;
			return "Galinha parou de cagar.";
		}
		else {
			return "Galinha não está cagando..";
		}
	}
}
