programa{
  funcao inicio(){
  	
     //Este codigo pedirá para o usuario entrar com 10 numeros, irá ordenar em ordem decrescente
     //e imprimirá o resultado no final.
     
     //A questão usa o exemplo de vetor desordenado = 2,5,1,3,4,9,7,8,10,6 
     //Entrando com esses mesmos valores, obteremos 10,9,8,7,6,5,4,3,2,1 no fim do programa!
  
    inteiro i, copia, troca = 0, tamanho = 10, vetor[10]
    
    para(i = 0; i < tamanho; i++){
      escreva("Digite um número: ")
      leia(vetor[i])
    }
    
    para(i = 0; i < tamanho; i++){
      escreva(vetor[i], ", ")
    }
    escreva("\n")
    
    escreva("A lista ordenada em ordem decrescente está assim:\n")
    
    faca{
      troca = 0
      para(i = 0; i < tamanho - 1; i++){
        se(vetor[i] < vetor[i+1]){
          copia = vetor[i]
          vetor[i] = vetor[i+1]
          vetor[i+1] = copia
          troca = 1
        }
      }
    }enquanto(troca == 1)

    escreva("A lista ordenada em ordem decrescente está assim:\n")
    limpa()
    escreva("A lista ordenada em ordem decrescente está assim:\n")
    para(i = 0; i < tamanho; i++){
      escreva(vetor[i], ", ")
    }
  }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1001; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */