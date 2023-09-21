//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
//Todos os elementos dos índices ímpares do vetor
//Todos os elementos do vetor que são números pares
//A Soma de todos os elementos do vetor
//A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
package Bloco1.Javinha.arrays;
import java.util.Scanner;
public class DeverDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        System.out.print("Elementos nos indices ímpares: ");
        for (int i = 0; i < 10; i++) {
            if (i%2!=0) {
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Elementos pares: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println(); // Nova linha
        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Média de todos os números: " + (double) soma / 10);

        scanner.close();
    }
}