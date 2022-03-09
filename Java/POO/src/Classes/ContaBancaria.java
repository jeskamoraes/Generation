package Classes;

public class ContaBancaria extends Pessoa {
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public ContaBancaria(String nome, int idade, String cpf, String endereco, int telefone, String email, int agencia, int numero, double saldo)
	{
		super(nome, idade, cpf, endereco, telefone, email);
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override // SOBREPOSIÇÃO
	public void imprimirInfo() {
		
	}
	
	public void imprimirSaldo() {
		System.out.println("\nSaldo disponível: R$"+getSaldo());
		System.out.println("-------------------------------");
	}
	
	public void Depositar(double deposito) {
		saldo += deposito;
		System.out.println("Depósito realizado com sucesso");
		this.imprimirSaldo();
	}
	
	public void Sacar(double saque) {
		
		if(saldo < saque)
		{
			System.out.println("Sem limite para saque.");
			this.imprimirSaldo();
		}
		else
		{
			saldo -= saque;
			System.out.println("Saque realizado com sucesso.");
			this.imprimirSaldo();
		}
	}
	
}
