//Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem
// indicando se este número é par ou ímpar e se o número é positivo ou negativo.


package Bloco1.Javinha.LacosDecisao.IfElse;

import java.util.Scanner;

public class DeverUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se é par ou ímpar:");
        double numero = scanner.nextDouble();
        if (numero % 2 == 0) {
            if (numero == 0) {
                System.out.println("Este numero é nulo(zero)!");
            } else {
                System.out.println("Este numero é par!");
            }
        } else {
            System.out.println("Este numero é ímpar!");
        }
    }
}
