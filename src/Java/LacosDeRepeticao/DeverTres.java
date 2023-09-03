
//questão 6
//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado.
// Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:
package Java.LacosDeRepeticao;
import java.util.Scanner;
public class DeverTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int multiplos = 0;
        int soma = 0;
        int media = 0;

        do {
            System.out.println("Digite um número:");
            numero = leia.nextInt();
            if (numero != 0) {
                if (numero % 3 == 0) {
                    soma += numero;
                    multiplos++;
                    media = soma / multiplos;
                }
            }
        } while (numero != 0);
        System.out.println("A média de todos os números múltiplos de 3 é " + media);
    }
}
