package HerancaEPolimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		
	Cachorro cachorro = new Cachorro(null, 0);
	cachorro.setNome("Tobias");
	cachorro.setIdade(2);
	System.out.println("\nNome: "+cachorro.getNome());
	System.out.println("Idade: "+cachorro.getIdade());
	cachorro.emitirSom();
	cachorro.correr();
	
	Cavalo cavalo = new Cavalo(null, 0);
	cavalo.setNome("Josivaldo");
	cavalo.setIdade(10);
	System.out.println("\nNome: "+cavalo.getNome());
	System.out.println("Idade: "+cavalo.getIdade());
	cavalo.emitirSom();
	cavalo.correr();
	
	Preguica preguica = new Preguica(null, 0);
	preguica.setNome("Jujuba");
	preguica.setIdade(5);
	System.out.println("\nNome: "+preguica.getNome());
	System.out.println("Idade: "+preguica.getIdade());
	preguica.emitirSom();
	preguica.correr();

	}

}
