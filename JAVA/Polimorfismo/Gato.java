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
			return "Gatinho está comendo.";
		}
		else {
			return "Gatinho já está comendo.";
		}
	}
	
	public String pararDeComer() {
		if(this.come == true) {
			this.come = false;
			return "Gatinho parou de comer.";
		}
		else {
			return "Gatinho já parou de comer..";
		}
	}
	
	public String andar() {
		if(this.anda == false) {
			this.anda = true;
			return "Gatinho está andando.";
		}
		else {
			return "Gatinho já está andando.";
		}
	}
	
	public String pararDeAndar() {
		if(this.anda == true) {
			this.anda = false;
			return "Gatinho está andando.";
		}
		else {
			return "Gatinho já está andando.";
		}
	}
	
	public String cagar() {
		if(this.caga == false) {
			this.caga = true;
			return "Gatinho está cagando.";
		}
		else {
			return "Gatinho já está cagando.";
		}
	}
	
	public String pararDeCagar() {
		if(this.caga == true) {
			this.caga = false;
			return "gatinho parou de cagar.";
		}
		else {
			return "Gatinho não está cagando..";
		}
	}
	
}
