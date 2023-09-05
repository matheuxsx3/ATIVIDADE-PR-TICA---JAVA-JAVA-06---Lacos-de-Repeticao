//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
// O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores
// e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
//Mostre na tela todas as cores que foram adicionadas.
//Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
package Javinha.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DeverUm {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite uma cor: ");
            String cor = scanner.nextLine();
            cores.add(cor);
        }
        scanner.close();
        System.out.println("Listar todas as cores:\n");
        for (String cor : cores) {
            System.out.println(cor);
        }
        Collections.sort(cores);
        System.out.println("Ordenar as cores:\n");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
