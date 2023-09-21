/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos
e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator*/

package Bloco1.Javinha.collections.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DeverUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        int num;
        System.out.println("Você deve entrar com 10 numeros inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro:");
            num = leia.nextInt();
            numeros.add(num);
        }
        System.out.println("Listar dados do Set:");

        Iterator<Integer> inumeros = numeros.iterator();
        while (inumeros.hasNext()) {
            System.out.println(inumeros.next());

        }
    }
}
