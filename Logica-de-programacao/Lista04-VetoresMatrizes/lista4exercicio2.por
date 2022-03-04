programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamentosDado[10], maior = 0, contador = 0
		real soma = 0, media = 0

		para(inteiro i = 0; i < 10; i++) 
		{
			lancamentosDado[i] = Util.sorteia(1, 6)
			soma += lancamentosDado[i]
			media = soma / 10

			se(lancamentosDado[i] >= maior)
			{
				
				se(lancamentosDado[i] > maior)
				{
				contador = 1
				}
					
					se(lancamentosDado[i] == maior)
					{
					contador++
					}
					
			maior = lancamentosDado[i]
			}
		}
		
		escreva("LANÇAMENTO DO DADO")
		escreva("\n--------------------\n")
		para(inteiro i = 0; i < 10; i++)
		{
			escreva(lancamentosDado[i] + " ")
		}
		escreva("\n--------------------")
		
		//escreva("\nSoma = " + soma)
		escreva("\n\nMédia = " + media)
		escreva("\nMaior número lançado = " + maior)
		escreva("\nQuantidade de vezes que o maior número apareceu: " + contador + "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 659; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */