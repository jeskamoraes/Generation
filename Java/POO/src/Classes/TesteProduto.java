package Classes;

public class TesteProduto {

	public static void main(String[] args) {
		
		Patinete patinete = new Patinete(null, null, 0, 0, 0, 0, false);
		patinete.setNome("Patinete Marlom");
		patinete.setCategoria("Transporte");
		patinete.setPeso(3);
		patinete.setPrecoCompra(365.20);
		//patinete.setPrecoVenda(0);
		patinete.setQuantidadeEstoque(3);
		patinete.setMargemLucro(50);
		patinete.calcularPrecoVenda();
		patinete.verificarEstoque();
		
		
		Aviao aviao = new Aviao(null, null, 0, 0, 0, 0, false);
		aviao.setNome("Jatinho");
		aviao.setCategoria("Transporte aéreo");
		aviao.setPeso(4590);
		aviao.setPrecoCompra(396000000.00);
		//patinete.setPrecoVenda(0);
		aviao.setQuantidadeEstoque(1);
		aviao.setMargemLucro(30);
		aviao.calcularPrecoVenda();
		aviao.verificarEstoque();
		
		
	}

}
