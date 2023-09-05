/*Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String,
 para organizar a ordem de chegada dos Clientes de um Banco.
 O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
        1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
        2: Listar todos os Clientes na fila
        3: Chamar (retirar) uma pessoa da fila
        0: O programa deve ser finalizado.
        Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar
        (chamar) um cliente da fila...
*/
package Javinha.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeverUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> objeto = new LinkedList<>();
        boolean condicao = true;

        while (condicao) {
            System.out.println("***********************************************************************");
            System.out.println("1: Adicionar um novo Cliente na fila. \n2: Listar todos os Clientes na fila \n3: Retirar Cliente da fila \n0: Sair");
            System.out.println("***********************************************************************");
            System.out.println("Digite uma opção:");
            int numero = scanner.nextInt();

            switch (numero) {
                case 0 -> condicao = false;
                case 1 -> {
                    System.out.println("Digite o nome:");
                    String nome = scanner.next();
                    objeto.add(nome);
                }
                case 2 -> System.out.println(objeto);
                case 3 -> {
                    if (objeto.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        objeto.remove();
                    }
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
