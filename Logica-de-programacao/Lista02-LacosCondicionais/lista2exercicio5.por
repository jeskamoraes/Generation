programa
{
	funcao inicio()
	{
		real indice
		
		escreva("Informe o índice de poluição: ")
		leia(indice)

		se(indice >= 0.05 e indice <=0.25)
		{
			escreva("\nÍNDICE ACEITÁVEL")
		}
		senao se(indice > 0.25 e indice < 0.3)
		{
			escreva("\nALERTA! CUIDE - SE PARA QUE NÃO SEJA NECESSÁRIA A SUSPENSÃO DAS ATIVIDADES DA INDÚSTRIA")
		}
		senao se(indice >= 0.3 e indice < 0.4)
		{
			escreva("\nINDÚSTRIAS DO GRUPO 1 DEVEM SUSPENDER SUAS ATIVIDADES IMEDIATAMENTE")
		}
		senao se(indice >= 0.4 e indice < 0.5)
		{
			escreva("\nINDÚSTRIAS DOS GRUPOS 1 E 2 DEVEM SUSPENDER SUAS ATIVIDADES IMEDIATAMENTE")
		}
		senao se(indice >= 0.5)
		{
			escreva("\nINDÚSTRIAS DOS GRUPOS 1, 2 E 3 DEVEM SUSPENDER SUAS ATIVIDADES IMEDIATAMENTE")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */