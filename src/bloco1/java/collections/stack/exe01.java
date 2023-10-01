/*Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
        1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
        2: Listar todos os livros da Pilha
        3: Retirar um livro da pilha
        0: O programa deve ser finalizado.
        Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
*/
package bloco1.java.collections.stack;

import java.util.Stack;
import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {


        Stack<String> pilhaDeLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************************************");
        System.out.println("Menu:");
        System.out.println("1: Adicionar um novo livro na pilha");
        System.out.println("2: Listar todos os livros da pilha");
        System.out.println("3: Retirar um livro da pilha");
        System.out.println("0: Sair do programa");
        System.out.println("******************************************************************");

        while (true) {

            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.print("Digite o nome do livro: ");
                    String nomeLivro = scanner.nextLine();
                    pilhaDeLivros.push(nomeLivro);
                    System.out.println("Livro adicionado!");
                }
                case 2:
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("A pilha de livros está vazia.");
                    } else {
                        System.out.println("Lista de Livros na Pilha:");
                        System.out.println(pilhaDeLivros);
                    }
                    break;
                case 3:
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("A pilha de livros está vazia.");
                    } else {
                        pilhaDeLivros.pop();
                        System.out.println("Um Livro foi retirado da pilha!");
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
