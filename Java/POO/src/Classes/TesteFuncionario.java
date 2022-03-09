package Classes;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario(null, 0, null, null, 0, null, null, 0, null, null);

		funcionario.setNome("Juliete de Souza");
		funcionario.setIdade(36);
		funcionario.setCpf("365.365.365-36");
		funcionario.setEndereco("Avenida das Margaridas, 300 - Vila Mercedes");
		funcionario.setTelefone(966663888);
		funcionario.setEmail("juliete@email.com");
		funcionario.setSalario(1350.65);
		funcionario.setSetor("Vendas");
		// funcionario.setValorVendaMensal(653.65);
		// funcionario.setComissao(30);

		funcionario.imprimirInfo();
		//funcionario.calcularSalarioTotal();
		// funcionario.formatarMoeda();
		funcionario.calcularSalarioTotal();
	}

}
