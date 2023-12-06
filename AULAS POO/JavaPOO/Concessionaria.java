package JavaPOO;

public class Concessionaria {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		c1.cor= "Preta";
		c1.modelo = "Kwid";
		c1.preco = 150000;
		
		Carro c2 = new Carro(200000, "NAOSEI");
		c2.cor = "Amarelo";
		
		Carro c3 = new Carro("preto","NAOSEI", 200000);
		
		

	}

}
