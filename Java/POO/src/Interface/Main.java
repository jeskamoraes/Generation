
package Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//INSTANCIANDO OBJETOS
		Funcionario funcionario = new Funcionario(null, null, null);
		ControleFuncionario controle = new ControleFuncionario();
		List<Funcionario> funcionarios = new ArrayList<>();
		Scanner leitor = new Scanner(System.in);
		
		int opcao; //VARIÁVEL DE OPÇÃO DO MENU

		do {
			System.out.println("\n-----> Cadastro de Funcionário <----- " + "\nOpções: " + "\n1- Cadastrar "
					+ "\n2- Exibir " + "\n3- Remover " + "\n0- Sair");

			opcao = leitor.nextInt();

			switch (opcao) {
			case 1:
				controle.Cadastrar();
				break;
			case 2:
				controle.Exibir();
				break;
			case 3:
				controle.Remover();
				break;
			default:
				if (opcao == 0) {
					System.exit(0);
				} else {
					System.out.println("Opção inválida.");
				}
			}
		} while (opcao != 0);
	}
}
