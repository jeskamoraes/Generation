package HerancaEPolimorfismo;
//PARTE I DO EXERC�CIO
public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	//PARTE II DO EXERC�CIO
	@Override
	public void emitirSom() {
		System.out.println(".......");
	}
	@Override
	public void correr() {
		System.out.println("N�o corre");
	}
}
