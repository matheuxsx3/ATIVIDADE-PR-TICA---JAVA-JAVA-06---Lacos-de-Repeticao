//Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
//Todos os elementos da Diagonal Principal
//Todos os elementos da Diagonal Secundária
//A Soma de todos os elementos da Diagonal Principal
//A Soma de todos os elementos da Diagonal Secundária

package Bloco1.Javinha.arrays;

import java.util.Scanner;

public class DeverTres {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("voce deve digitar 10 numeros...");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite um numero:");
                matriz[i][j] = leia.nextInt();
            }
        }
        int somaUm = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int somaDois = matriz[0][2] + matriz[1][1] + matriz[2][0];

        System.out.println("Elementos da diagonal principal: " + matriz[0][0] + " " + matriz[1][1] + " " + matriz[2][2]);
        System.out.println("Elementos da Diagonal Secundária: " + matriz[0][2] + " " + matriz[1][1] + " " + matriz[2][0]);
        System.out.println("Soma dos Elementos da Diagonal Principal:" + somaUm);
        System.out.println("Soma dos Elementos da Diagonal Secundária:" + somaDois);


    }

}


