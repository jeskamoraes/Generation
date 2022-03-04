programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real peso = 0, excesso = 0, multa = 0

		escreva("Informe o peso do produto: ")
		leia(peso)

		se (peso > 50)
		{
			excesso = mat.arredondar(peso - 50, 2)
			multa = mat.arredondar(4 * excesso, 2)
			
			escreva("\n-------------------")
			escreva("\nEXCESSO DETECTADO")
			escreva("\n-------------------")
			escreva("\nPeso = " + peso + " kg\nExcesso = " + excesso + " kg\nMulta = R$ " + multa + "\n")
		}
		senao
		{
		escreva("\n-------------------")
		escreva("\nNÃO HOUVE EXCESSO")
		escreva("\n-------------------")
		escreva("\nPeso = " + peso + " kg\nExcesso = " + excesso + " kg\nMulta = R$ " + multa + "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 677; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */