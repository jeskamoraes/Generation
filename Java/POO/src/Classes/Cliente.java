package Classes;

import java.util.Scanner;

public class Cliente extends Pessoa{
	
	private double saldoDevedor;
	private String recebimento;
	
	Cliente(String nome, int idade, String cpf, String endereco, int telefone, String email, double saldoDevedor, String recebimento)
	{
		super(nome, idade, cpf, endereco, telefone, email);
		this.saldoDevedor = saldoDevedor;
		this.recebimento = recebimento;
	}

	public double getSaldoDevedor() {
		return saldoDevedor;
	}

	public void setSaldoDevedor(double saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}

	public String getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(String recebimento) {
		this.recebimento = recebimento;
	}
	
	public void calculaSaldoDevedor()
	{
		
	}
	
	@Override
	public void imprimirInfo() {
		System.out.println("------------------------");
		System.out.println("Informações do cliente");
		System.out.println("------------------------");
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()+"\nTelefone: "+
		getTelefone()+"\nEmail: "+getEmail());
	}
	
	public void receberProduto()
	{
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("\n---> Opção de entrega: \n****Digite 'Retirar' em caso de retirada do produto na loja****"
				+ "\n****Digite 'Entrega' para receber o produto em casa****");
		recebimento = leitor.nextLine();
		
		switch(recebimento)
		{
		case "Retirar":
			System.out.println("\n\t---> Cliente: "+getNome()+" optou por retirar o produto na loja.");
			break;
		case "Entrega": 
			System.out.println("\n\t---> Cliente: "+getNome()+" optou por receber o produto em casa.\n"
					+ "\t---> Endereço para entrega: "+getEndereco());
			break;
		}
		leitor.close();
	}
}
