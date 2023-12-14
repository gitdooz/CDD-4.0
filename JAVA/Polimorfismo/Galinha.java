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
			return "Galinha est� comendo.";
		}
		else {
			return "Galinha j� est� comendo.";
		}
	}
	
	public String pararDeComer() {
		if(this.come == true) {
			this.come = false;
			return "Galinha parou de comer.";
		}
		else {
			return "Galinha j� parou de comer..";
		}
	}
	
	public String andar() {
		if(this.anda == false) {
			this.anda = true;
			return "Galinha est� andando.";
		}
		else {
			return "Galinha j� est� andando.";
		}
	}
	
	public String pararDeAndar() {
		if(this.anda == true) {
			this.anda = false;
			return "Galinha est� andando.";
		}
		else {
			return "Galinha j� est� andando.";
		}
	}
	
	public String cagar() {
		if(this.caga == false) {
			this.caga = true;
			return "Galinha est� cagando.";
		}
		else {
			return "Galinha j� est� cagando.";
		}
	}
	
	public String pararDeCagar() {
		if(this.caga == true) {
			this.caga = false;
			return "Galinha parou de cagar.";
		}
		else {
			return "Galinha n�o est� cagando..";
		}
	}
}
