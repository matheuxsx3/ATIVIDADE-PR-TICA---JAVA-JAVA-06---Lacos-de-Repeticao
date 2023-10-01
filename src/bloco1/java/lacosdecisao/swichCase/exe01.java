/*
exercício 5 (lista2)

Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item
(número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro).
A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
*/

package bloco1.java.lacosdecisao.swichCase;

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {

        System.out.println("########CÁRDAPIO########\n1 = Cachorro quente-R$10\n2 = X-salada-R$15\n3 = X-Bacon-R$18\n4 = Bauru-R$12\n5 = Refrigerante-R$8 \n6 = Suco de laranja-R$13\n#######################");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o código do produto que deseja:");
        int opcao = leia.nextInt();
        System.out.println("Digite o quantidade que deseja");
        double quantidade = leia.nextInt();

        double preco, valorTotal;

        switch (opcao) {
            case 1 -> {
                preco = 10;
                valorTotal = quantidade * preco;
                System.out.println("produto = Cachorro quente\nvalor total = R$ " + valorTotal);
            }
            case 2 -> {
                preco = 15;
                valorTotal = quantidade * preco;
                System.out.println("produto = X-Salada\n valor total = R$" + valorTotal);
            }
            case 3 -> {
                preco = 18;
                valorTotal = quantidade * preco;
                System.out.println("produto = X-Bacon\nvalor total = R$ " + valorTotal);
            }
            case 4 -> {
                preco = 12;
                valorTotal = quantidade * preco;
                System.out.println("produto = Bauru\nvalor total = R$ " + valorTotal);
            }
            case 5 -> {
                preco = 8;
                valorTotal = quantidade * preco;
                System.out.println("produto = Refrigerante\nvalor total = R$ " + valorTotal);
            }
            case 6 -> {
                preco = 13;
                valorTotal = quantidade * preco;
                System.out.println("produto = Suco de laranja\nvalor total = R$ " + valorTotal);
            }
        }

    }
}


