//Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo
// que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir
// na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
// encontrado!” deve ser exibida na tela.

package Javinha.arrays;

import java.util.Scanner;

public class DeverUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        System.out.println("Digite o numero que voce deseja encontrar:");
        int numero = leia.nextInt();
        int negativo = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("O número " + numero + " está localizado na posição: " + i);
                negativo += 1;
            }
        }
        if (negativo == 0) {
            System.out.println("Não foi encontrado");
        }

    }
}

