package Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleFuncionario implements InterfaceDAO {

	Scanner leitor = new Scanner(System.in);
	List<Funcionario> funcionarios = new ArrayList<>();

	@Override
	public void Cadastrar() {
		Funcionario funcionario = new Funcionario(null, null, null);
		leitor.nextLine();
		funcionario.setNome(textInput("Nome: "));
		funcionario.setMatricula(textInput("Matrícula: "));
		funcionario.setTelefone(textInput("Telefone: "));

		String op;
		System.out.println("Deseja concluir o cadastro? (s/n)");
		op = leitor.next();

		switch (op) {
		case "s":
			funcionarios.add(funcionario);
			System.out.println("Cadastro adicionado com sucesso!");
			break;
		case "n":
			System.out.println("Cadastro não finalizado. Retornando ao menu anterior......");
			break;
		default:
			System.out.println("Opção inválida.");
		}
	}

	@Override
	public void Exibir() {
		if (funcionarios.size() == 0) {
			System.out.println("Não existem cadastros no sistema.");
		} else {
			for (int i = 0; i < funcionarios.size(); i++) {
				Funcionario funcionario = funcionarios.get(i);
				System.out.println("\nCadastro " + i);
				System.out.println("Nome: " + funcionario.getNome());
				System.out.println("Matrícula: " + funcionario.getMatricula());
				System.out.println("Telefone: " + funcionario.getTelefone());
			}
		}
		System.out.println("\nFim da lista");

	}

	@Override
	public void Remover() {
		System.out.println("Digite o número do cadastro que deseja remover: ");
		int remover = leitor.nextInt();

		for (int i = 0; i < funcionarios.size(); i++) {
			Funcionario funcionario = funcionarios.get(i);
			if (remover == i) {
				funcionarios.remove(funcionario);
				System.out.println("Cadastro removido com sucesso");
			}
		}

	}

	private String textInput(String label) {
		System.out.println(label);
		return leitor.nextLine();
	}

}
