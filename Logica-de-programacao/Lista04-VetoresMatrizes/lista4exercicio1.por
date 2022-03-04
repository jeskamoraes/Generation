programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5], maior = 0
		
		para(inteiro i = 0; i < 5; i++)
		{
			escreva("Informe a pontuação: ")
			leia(pontuacao[i])

			se(pontuacao[i] > maior)
			{
				maior = pontuacao[i]
			}
		}

			escreva("\n-------")
			escreva("\n VETOR\n")
			escreva("-------\n")
		
		para(inteiro i = 0; i < 5; i++)
		{
			
			escreva(pontuacao[i] + " ")
		}
		escreva("\n\nMAIOR VALOR ENCONTRADO NO VETOR: " + maior + "\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */