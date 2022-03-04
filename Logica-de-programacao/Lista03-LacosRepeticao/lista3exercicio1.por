programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		inteiro  salarioMenor100 = 0
		real habitantes = 20, filhos, quantidadeFilhos = 0, salario, maiorSalario = 0, somaSalario = 0, mediaSalario = 0, percentual = 0, mediaQuantidadeFilhos = 0
		
		para(inteiro i = 1; i <= habitantes; i++)
		{
			escreva("\nInforme o salário: ")
			leia(salario)

			escreva("Informe a quantidade de filhos: ")
			leia(filhos)

			escreva("\n*******************************")

			mat.arredondar(somaSalario += salario, 2)
			mediaSalario = mat.arredondar((somaSalario / habitantes),2)

			// VERIFICA E GUARDA O MAIOR SALÁRIO DIGITADO
			se(salario > maiorSalario)
			{
				maiorSalario = mat.arredondar(salario, 2)
			}

			// VERIFICA E SOMA A QUANTIDADE DE PESSOAS COM O SLÁRIO MENOR OU IGUAL A 100
			se(salario <= 100.0)
			{
				salarioMenor100++
				percentual = mat.arredondar(((salarioMenor100 * 100) / habitantes), 2)
			}
			
			quantidadeFilhos += filhos
			mediaQuantidadeFilhos = mat.arredondar((quantidadeFilhos / habitantes),2)
		}
		escreva("\n--------------------------------")
		escreva("\n *Informações adicionais* ")
		escreva("\n--------------------------------")
		escreva("\nSALÁRIO TOTAL = " + somaSalario)
		escreva("\nMÉDIA SALÁRIO = " + mediaSalario)
		escreva("\nQUANTIDADE DE FILHOS = " + quantidadeFilhos)
		escreva("\n--------------------------------")
		escreva("\n\n--> MAIOR SALÁRIO = " + maiorSalario)
		escreva("\n--> MÉDIA DE FILHOS = " + mediaQuantidadeFilhos)
		escreva("\n--> PERCENTUAL DE PESSOAS COM SALÁRIO ATÉ R$100.00 = " + percentual + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */