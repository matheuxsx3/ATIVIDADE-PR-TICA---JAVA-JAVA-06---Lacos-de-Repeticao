package bloco1.java.exceptions;

import java.util.Scanner;

public class TestaExceptions {
    public static void main(String[] args) {
        System.out.println("ola");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        boolean opcao = true;

        while (opcao) {
            try {
                if (numero == 0) {
                    opcao = false;
                } else if (numero == 1) {
                    System.out.println("Primeira opção selecionada!");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
