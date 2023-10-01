/*
Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer,
inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário,
que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set,
exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja encontrado,
 ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
 */

package bloco1.java.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        int temNoNumeros;
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        if (numeros.contains(num)) {
            System.out.println("O numero "+num+" foi encontrado");
        } else {
            System.out.println("O numero "+num+" não foi encontrado");
        }

    }


}

