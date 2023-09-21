//questão 2
// Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números
//são pares e quantos número são ímpares.
package Bloco1.Javinha.lacosrepeticao;
import java.util.Scanner;

public class DeverUm {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int pares = 0, impares = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um numero:");
            int numero = leia.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

        }
        System.out.println("total de pares:\n" + pares + "\ntotal de impares\n" + impares);

    }
}



