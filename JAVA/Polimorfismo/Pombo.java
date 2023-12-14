package Polimorfismo;

public class Pombo extends Aves{
	String nome;
	String cor;
	public Pombo(String nome, String cor, String especie, boolean penas) {
		super(nome, penas, especie);
		this.nome = nome;
		this.cor = cor;
	}
	
	public String comer() {
		if(this.come == false) {
			this.come = true;
			return "Pombinho est� comendo.";
		}
		else {
			return "Pombinho j� est� comendo.";
		}
	}
	
	public String pararDeComer() {
		if(this.come == true) {
			this.come = false;
			return "Pombinho parou de comer.";
		}
		else {
			return "Pombinho j� parou de comer..";
		}
	}
	
	public String andar() {
		if(this.anda == false) {
			this.anda = true;
			return "Pombinho est� andando.";
		}
		else {
			return "Pombinho j� est� andando.";
		}
	}
	
	public String pararDeAndar() {
		if(this.anda == true) {
			this.anda = false;
			return "Pombinho est� andando.";
		}
		else {
			return "Pombinho j� est� andando.";
		}
	}
	
	public String cagar() {
		if(this.caga == false) {
			this.caga = true;
			return "Pombinho est� cagando.";
		}
		else {
			return "Pombinho j� est� cagando.";
		}
	}
	
	public String pararDeCagar() {
		if(this.caga == true) {
			this.caga = false;
			return "Pombinho parou de cagar.";
		}
		else {
			return "Pombinho n�o est� cagando..";
		}
	}
}
