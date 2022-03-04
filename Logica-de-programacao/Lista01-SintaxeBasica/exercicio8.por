programa
{
	
	funcao inicio()
	{
		real custoFabrica, custoConsumidor, custoDistribuidor, valorImposto, soma

		escreva("--->CALCULA O CUSTO DE UM CARRO NOVO AO CONSUMIDOR<---")
		
		escreva("\nInforme o custo de fábrica: ")
		leia(custoFabrica)

		custoDistribuidor = custoFabrica + (custoFabrica * 0.29)
		valorImposto = custoFabrica + (custoFabrica * 0.47)

		custoConsumidor = custoFabrica + custoDistribuidor + valorImposto

		escreva("CUSTO AO CONSUMIDOR = R$" + custoConsumidor)

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */