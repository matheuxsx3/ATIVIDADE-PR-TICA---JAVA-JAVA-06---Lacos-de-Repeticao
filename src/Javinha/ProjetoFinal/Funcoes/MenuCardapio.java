package Javinha.ProjetoFinal.Funcoes;

import Javinha.ProjetoFinal.Alimentos.Carrinho.Teste;

import java.util.Scanner;


public class MenuCardapio {
    public void escolha() {
        System.out.println("0 - voltar para o menu inicial");
        System.out.println("1 - Ver somente promoções");
        System.out.println("2 - Adicionar um item ao carrinho");
        System.out.println("3 - remover um item do carrinho");
        System.out.println("4 - visualizar carrinho");


        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            System.out.println("Digite uma opção:");
            MenuInicial inicio = new MenuInicial();
            Teste teste = new Teste();
            int num = scanner.nextInt();
            switch (num) {
                case 0:
                    loop = false;

                    inicio.menuInicial();
                    break;

                case 1:
                    System.out.println("promoções esgotadas");
                    break;
                case 2: {
                    System.out.println("Você escolheu adicionar um item ao carrinho!");
                    boolean loop2 = true;
                    while (loop2) {
                        try {
                            System.out.println("Qual é o código do item que você deseja adicionar?:");
                            int codigoSelecionado = scanner.nextInt();
                            System.out.println("Qual é a quantidade que você deseja?:");
                            int quantidadeSelecionada = scanner.nextInt();
                            teste.encontrarProdutoAdicionado(codigoSelecionado, quantidadeSelecionada);
                            loop2 = false;
                        } catch (Exception e) {
                            System.err.println("Entre com um número inteiro!");
                        }
                    }
                    break;
                }
                case 3:
                    System.out.println("opcao em construção");
                    break;
                case 4:
                    teste.exibirCarrinho();
                    break;
                default:
                    System.out.println("O numero escolhido não esta disponivel.");
                    break;
            }
        }
    }
}
