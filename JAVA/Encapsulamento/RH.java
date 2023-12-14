package Encapsulamento;

public class RH {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		
		System.out.println("--- Olá, sou a RH Mia, prazer! ---");
		
		func1.nome = "Pacheco";
		func1.endereco = "Rua do Sol, 131";
		func1.ajustarcpf("11821626494");
		
		System.out.print("Nome: " + func1.nome+ 
				"\nEndereço: " + func1.endereco+
				"\nCPF: "+ func1.mostrarCpf());
	}
}
