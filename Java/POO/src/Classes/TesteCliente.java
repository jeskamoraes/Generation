package Classes;

public class TesteCliente {

	public static void main(String[] args) {

		System.out.println("\n\n*****************************TESTE CLIENTE*****************************");
		Cliente cliente = new Cliente("Ana Julia da Silva", 39, "347.698.999-00",
				"Rua das Amoras, 356 - Parque da Framboesa", 965881122, "anaju@email.com", 0, null);

		cliente.imprimirInfo();
		cliente.receberProduto();
		
		System.out.println("\n\n*****************************TESTE CONTA BANCÁRIA*****************************");
		ContaBancaria conta = new ContaBancaria("Ana Julia da Silva", 39, "347.698.999-00",
				"Rua das Amoras, 356 - Parque da Framboesa", 965881122, "anaju@email.com", 1234, 00123, 6532.60);
		
		conta.imprimirSaldo();
		conta.Sacar(0.6);
		conta.Depositar(100);
		conta.Sacar(7000);
		
		System.out.println("\n\n*****************************TESTE PACIENTE*****************************");
		Paciente paciente = new Paciente("Ana Julia da Silva", 39, "347.698.999-00",
				"Rua das Amoras, 356 - Parque da Framboesa", 965881122, "anaju@email.com", 001, "XML035");
		
		paciente.imprimirInfo();
	}

}
