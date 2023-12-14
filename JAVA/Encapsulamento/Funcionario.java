package Encapsulamento;

public class Funcionario {
	String nome;
	String endereco;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private double salario;
	private int qntFilhos;
	
	public void ajustarcpf(String cpf) {
		this.cpf = cpf;
	}
	public String mostrarCpf() {
		return this.cpf;
	}
}
