package Classes;

import java.text.NumberFormat;
import java.util.Scanner;

public class Funcionario extends Pessoa{
	
	private String setor;
	private double salario;
	private String valorVendaMensal;
	private String comissao;
	private double salarioTotal;
	
	Funcionario(String nome, int idade, String cpf, String endereco, int telefone, String email, String setor, double salario, 
			String valorVendasMensal, String comissao)
	{
		super(nome, idade, cpf, endereco, telefone, email);
		this.setor = setor;
		this.salario = salario;
		this.valorVendaMensal = valorVendasMensal;
		this.comissao = comissao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getValorVendaMensal() {
		return valorVendaMensal;
	}

	public void setValorVendaMensal(String valorVendaMensal) {
		this.valorVendaMensal = valorVendaMensal;
	}

	public String getComissao() {
		return comissao;
	}

	public void setComissao(String comissao) {
		this.comissao = comissao;
	}
	
	@Override
	public void imprimirInfo() {
		System.out.println("\n\n--------------------------");
		System.out.println("Informações do funcionário");
		System.out.println("--------------------------");
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()+"\nTelefone: "+
				+getTelefone()+"\nEmail: "+getEmail()+"\nSetor:"+setor+"\nSalário R$: "+salario);
	}
	
	public void calcularSalarioTotal() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor da venda mensal realizada pelo funcionário: "+getNome());
		valorVendaMensal = leitor.nextLine();
		double convertVendaMensal = Double.parseDouble(valorVendaMensal);
		
		System.out.println("Informe a comissão (sem %): ");
		comissao = leitor.nextLine();
		double convertComissao = Double.parseDouble(comissao);
		
		salarioTotal = salario + (convertVendaMensal*(convertComissao/100));
		
		System.out.println("\nComissão de "+convertComissao+"%"+"\nSalário total: R$"+this.formatarMoeda());
		leitor.close();
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // DEFINE O TIPO DA MOEDA
		nf.setMaximumFractionDigits(2); // DEFINE QUANTAS CASAS DEPOIS DA VÍRGULA
		String formatoMoeda = nf.format(salarioTotal); // FORMATA O NÚMERO COM PONTO
		return formatoMoeda;
	}
	                           
}
