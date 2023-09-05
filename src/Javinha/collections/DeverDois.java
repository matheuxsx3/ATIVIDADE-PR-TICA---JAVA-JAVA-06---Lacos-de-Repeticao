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

        int posicao = numero.indexOf(num);

        if (posicao != -1) {

            System.out.println("O número " + num + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + num + " não foi encontrado!");

        }
    }
}
