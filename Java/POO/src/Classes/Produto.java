package Classes;

public abstract class Produto {

	private String nome;
	private String categoria; // SWITCH CASE
	private double peso;
	private double precoVenda;
	private double precoCompra;
	private int quantidadeEstoque;
	private boolean ativo;

	abstract public void calcularPrecoVenda();
	abstract public void verificarEstoque();

	public Produto(String nome, String categoria, double peso, double precoVenda, double precoCompra,
			int quantidadeEstoque, boolean ativo) {

		this.nome = nome;
		this.categoria = categoria;
		this.peso = peso;
		this.precoVenda = precoVenda;
		this.precoCompra = precoCompra;
		this.quantidadeEstoque = quantidadeEstoque;
		this.ativo = ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
