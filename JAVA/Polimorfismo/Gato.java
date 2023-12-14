package Polimorfismo;

public class Gato extends Animal{
	String nome;
	String cor;
	public Gato(String nome, String cor, String especie, int patas) {
		super(nome, especie);
		this.nome = nome;
		this.cor = cor;
	}
	public String comer() {
		if(this.come == false) {
			this.come = true;
			return "Gatinho est� comendo.";
		}
		else {
			return "Gatinho j� est� comendo.";
		}
	}
	
	public String pararDeComer() {
		if(this.come == true) {
			this.come = false;
			return "Gatinho parou de comer.";
		}
		else {
			return "Gatinho j� parou de comer..";
		}
	}
	
	public String andar() {
		if(this.anda == false) {
			this.anda = true;
			return "Gatinho est� andando.";
		}
		else {
			return "Gatinho j� est� andando.";
		}
	}
	
	public String pararDeAndar() {
		if(this.anda == true) {
			this.anda = false;
			return "Gatinho est� andando.";
		}
		else {
			return "Gatinho j� est� andando.";
		}
	}
	
	public String cagar() {
		if(this.caga == false) {
			this.caga = true;
			return "Gatinho est� cagando.";
		}
		else {
			return "Gatinho j� est� cagando.";
		}
	}
	
	public String pararDeCagar() {
		if(this.caga == true) {
			this.caga = false;
			return "gatinho parou de cagar.";
		}
		else {
			return "Gatinho n�o est� cagando..";
		}
	}
	
}
