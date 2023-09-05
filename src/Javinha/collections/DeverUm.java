package Javinha.collections;

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
        System.out.println("Listar todas as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }
        Collections.sort(cores);
        System.out.println("Ordenar as cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
