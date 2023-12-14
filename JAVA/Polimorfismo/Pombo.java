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
			return "Pombinho está comendo.";
		}
		else {
			return "Pombinho já está comendo.";
		}
	}
	
	public String pararDeComer() {
		if(this.come == true) {
			this.come = false;
			return "Pombinho parou de comer.";
		}
		else {
			return "Pombinho já parou de comer..";
		}
	}
	
	public String andar() {
		if(this.anda == false) {
			this.anda = true;
			return "Pombinho está andando.";
		}
		else {
			return "Pombinho já está andando.";
		}
	}
	
	public String pararDeAndar() {
		if(this.anda == true) {
			this.anda = false;
			return "Pombinho está andando.";
		}
		else {
			return "Pombinho já está andando.";
		}
	}
	
	public String cagar() {
		if(this.caga == false) {
			this.caga = true;
			return "Pombinho está cagando.";
		}
		else {
			return "Pombinho já está cagando.";
		}
	}
	
	public String pararDeCagar() {
		if(this.caga == true) {
			this.caga = false;
			return "Pombinho parou de cagar.";
		}
		else {
			return "Pombinho não está cagando..";
		}
	}
}
