//Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano.
// As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada
// linha da matriz serão as notas de um participante. Em um vetor de números reais,
// armazene as médias de cada participante e exiba as médias de cada um na tela
package bloco1.java.arrays;

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[][] matriz = new double[10][4];
        double[] medias = new double[10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite um numero");
                matriz[i][j] = leia.nextDouble();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            double soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            medias[i] = soma / matriz[i].length;
        }

        System.out.println("Médias dos participantes:");
        for (int i = 0; i < medias.length; i++) {
            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
        }
    }
}