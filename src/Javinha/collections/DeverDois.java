//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros.
// O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no
// ArrayList, exiba na tela a posição deste número na Collection. Caso o número não seja encontrado,
// ele deverá exibir na tela a mensagem: O número NN não foi encontrado!

package Javinha.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class DeverDois {
    public static void main(String[] args) {
        ArrayList<Integer> numero = new ArrayList<>();

        Scanner leia = new Scanner(System.in);

        int num = 0;
        numero.add(2);
        numero.add(5);
        numero.add(1);
        numero.add(3);
        numero.add(4);
        numero.add(9);
        numero.add(7);
        numero.add(8);
        numero.add(10);
        numero.add(6);

        System.out.println("Digite o número que você deseja encontrar:");
        num = leia.nextInt();

        int posicao = -1;
        posicao = numero.indexOf(num);

        if (posicao != -1) {

            System.out.println("O número " + num + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }
    }
}
