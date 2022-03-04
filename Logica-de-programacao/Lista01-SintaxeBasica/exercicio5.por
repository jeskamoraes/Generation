programa
{
	inclua biblioteca Matematica-->mat
		
	funcao inicio()
	{
		cadeia nome
		real media, nota1, nota2, nota3, arredondaMedia

		escreva("---------------------------")
		escreva("\nCALCULANDO A MÉDIA DO ALUNO")
		escreva("\n---------------------------")

		escreva("\nInforme o nome do aluno: ")
		leia(nome)
		escreva("Informe a primeira nota do aluno: ")
		leia(nota1)
		escreva("Informe a segunda nota do aluno: ")
		leia(nota2)
		escreva("Informe a terceira nota do aluno: ")
		leia(nota3)

		media = ((nota1*2) + (nota2*3) + (nota3*5)) / 3
		arredondaMedia = mat.arredondar(media, 2)

		escreva("\n---> Aluno: " + nome + "\n---> Média: " + arredondaMedia)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 673; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */