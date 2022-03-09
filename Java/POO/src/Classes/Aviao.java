package Classes;

import java.text.NumberFormat;

public class Aviao extends Produto{
	
	private double precoVenda;
	private double margemLucro;
	
	public Aviao(String nome, String categoria, double preco, double precoVenda, double precoCompra, int quantidadeEstoque, boolean ativo)
	{
		super(nome, categoria, preco, precoVenda, precoCompra, quantidadeEstoque, ativo);
	}
	
	
	
	public double getPrecoVenda() {
		return precoVenda;
	}



	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}



	public double getMargemLucro() {
		return margemLucro;
	}



	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}



	@Override
	public void calcularPrecoVenda() {
		precoVenda = (getPrecoCompra() / (1 - 0.12 - (margemLucro / 100)));
		System.out.println("\nPara conseguir um lucro de "+margemLucro+"% o produto deve ser vendido por "+this.formatarMoeda());
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // DEFINE O TIPO DA MOEDA
		nf.setMaximumFractionDigits(2); // DEFINE QUANTAS CASAS DEPOIS DA VÍRGULA
		String formatoMoeda = nf.format(precoVenda); // FORMATA O NÚMERO COM PONTO
		return formatoMoeda;
	}
	
	@Override
	public void verificarEstoque() {
		if(getQuantidadeEstoque() > 0)
		{
			this.isAtivo();
			System.out.println("---> Produto em estoque.");
		}
		else
		{
			this.setAtivo(false);
			System.out.println("---> Não há produto em estoque.");
		}
	}
}
