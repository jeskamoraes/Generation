programa
{
	
	funcao inicio()
	{
		inteiro idadeAnos = 0, idadeMeses = 0, idadeDias, calculoIdadeDias

		escreva("\nINFORME SUA IDADE COMPLETA EM ANOS, MESES E DIAS")
		escreva("\n--------------------------------------------------")
		escreva("\nANOS: ")
		leia(idadeAnos)

		escreva("MESES: ")
		leia(idadeMeses)

		escreva("DIAS: ")
		leia(idadeDias)

		calculoIdadeDias = ((idadeAnos * 365) + (idadeMeses * 30) + idadeDias)

		escreva("A sua idade total em dias = " + calculoIdadeDias + " dias")
		

		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 502; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */