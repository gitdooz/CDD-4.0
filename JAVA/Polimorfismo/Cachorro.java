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
			return "Cachorro est� comendo.";
		}
		else {
			return "Cachorro j� est� comendo.";
		}
	}
	
	public String pararDeComer() {
		if(this.come == true) {
			this.come = false;
			return "Cachorro parou de comer.";
		}
		else {
			return "Cachorro j� parou de comer..";
		}
	}
	
	public String andar() {
		if(this.anda == false) {
			this.anda = true;
			return "Cachorro est� andando.";
		}
		else {
			return "Cachorro j� est� andando.";
		}
	}
	
	public String pararDeAndar() {
		if(this.anda == true) {
			this.anda = false;
			return "Cachorro est� andando.";
		}
		else {
			return "Cachorro j� est� andando.";
		}
	}
	
	public String cagar() {
		if(this.caga == false) {
			this.caga = true;
			return "Cachorro est� cagando.";
		}
		else {
			return "Cachorro j� est� cagando.";
		}
	}
	
	public String pararDeCagar() {
		if(this.caga == true) {
			this.caga = false;
			return "Cachorro parou de cagar.";
		}
		else {
			return "Cachorro n�o est� cagando..";
		}
	}
}
