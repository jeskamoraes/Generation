package Classes;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro(null, null, null, 0, 0);
		
		carro.setModelo("BMW");
		carro.setCor("azul");
		carro.setPlaca("OLX1356");
		carro.setAno(2020);
		carro.imprimirInfo();
		carro.acelerar(50);
		carro.imprimirVelocidade();
		carro.frear(10);
		carro.imprimirVelocidade();
		
	}

}
