package Polimorfismo;

public class Cachorro extends Mamiferos{
	String nome;
	String cor;
	public Cachorro(String nome, String cor, String especie, int patas) {
		super(nome, especie, pelos, cor);
		this.nome = nome;
		this.cor = cor;
	}
	
	public String comer() {
		if(this.come == false) {
			this.come = true;
			return "Cachorro está comendo.";
		}
		else {
			return "Cachorro já está comendo.";
		}
	}
	
	public String pararDeComer() {
		if(this.come == true) {
			this.come = false;
			return "Cachorro parou de comer.";
		}
		else {
			return "Cachorro já parou de comer..";
		}
	}
	
	public String andar() {
		if(this.anda == false) {
			this.anda = true;
			return "Cachorro está andando.";
		}
		else {
			return "Cachorro já está andando.";
		}
	}
	
	public String pararDeAndar() {
		if(this.anda == true) {
			this.anda = false;
			return "Cachorro está andando.";
		}
		else {
			return "Cachorro já está andando.";
		}
	}
	
	public String cagar() {
		if(this.caga == false) {
			this.caga = true;
			return "Cachorro está cagando.";
		}
		else {
			return "Cachorro já está cagando.";
		}
	}
	
	public String pararDeCagar() {
		if(this.caga == true) {
			this.caga = false;
			return "Cachorro parou de cagar.";
		}
		else {
			return "Cachorro não está cagando..";
		}
	}
}
