programa
{
	
	funcao inicio()
	{
		
		inteiro numero = 233
		escreva(numero + "\n")
		inteiro contador = 5

		enquanto(numero >= 233 e numero <300)
		{
		numero += contador
		escreva("\n" + numero + "\n")
		}
			
		enquanto(numero >= 300 e numero <=400)
		{
		contador = 3
		numero += contador
		escreva("\n" + numero + "\n")
		}
			
		enquanto(numero > 400 e numero <= 456)
		{
		contador = 5
		numero += contador
			se(numero <= 456)
			{
			escreva("\n" + numero + "\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */