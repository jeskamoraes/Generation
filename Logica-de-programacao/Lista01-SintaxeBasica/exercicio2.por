programa
{
	
	funcao inicio()
	{
		inteiro idadeDias
		inteiro idadeMeses, idadeAnos

		escreva("Digite sua idade em dias: ")
		leia(idadeDias)

		idadeAnos = idadeDias / 365
		idadeMeses = (idadeDias % 365) / 30
		idadeDias = (idadeDias % 365) % 30

		escreva("Idade em anos = " + idadeAnos + "\nIdade em meses = " + idadeMeses + "\nIdade em dias = " + idadeDias)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */