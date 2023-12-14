package Polimorfismo;

public class Vaca extends Mamiferos{
	String nome;
	String cor;
	public Vaca(String nome, String cor, String especie, boolean pelos) {
		super(nome, especie, pelos, cor);
		this.nome = nome;
		this.cor = cor;
	}
	
	public String comer() {
		if(this.come == false) {
			this.come = true;
			return "Vaca mumu est� comendo.";
		}
		else {
			return "Vaca mumu j� est� comendo.";
		}
	}
	
	public String pararDeComer() {
		if(this.come == true) {
			this.come = false;
			return "Vaca mumu parou de comer.";
		}
		else {
			return "Vaca mumu j� parou de comer..";
		}
	}
	
	public String andar() {
		if(this.anda == false) {
			this.anda = true;
			return "Vaca mumu est� andando.";
		}
		else {
			return "Vaca mumu j� est� andando.";
		}
	}
	
	public String pararDeAndar() {
		if(this.anda == true) {
			this.anda = false;
			return "Vaca mumu est� andando.";
		}
		else {
			return "Vaca mumu j� est� andando.";
		}
	}
	
	public String cagar() {
		if(this.caga == false) {
			this.caga = true;
			return "Vaca mumu est� cagando.";
		}
		else {
			return "Vaca mumu j� est� cagando.";
		}
	}
	
	public String pararDeCagar() {
		if(this.caga == true) {
			this.caga = false;
			return "Vaca mumu parou de cagar.";
		}
		else {
			return "Vaca mumu n�o est� cagando..";
		}
	}
}
