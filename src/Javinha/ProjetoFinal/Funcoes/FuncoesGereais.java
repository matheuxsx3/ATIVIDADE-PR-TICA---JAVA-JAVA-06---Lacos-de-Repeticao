package Javinha.ProjetoFinal.Funcoes;

import java.util.Scanner;

public class FuncoesGereais {
    public void BoasVindas() {
        System.out.println("*******************************************************************************");
        System.out.println("                      Bem vindo à padaria Pão Açucarado!                          ");
        System.out.println("*******************************************************************************");
    }

    int DigiteRespostaInt() {
        System.out.println("Digite sua resposta:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void MenuInicial() {
        Scanner scanner = new Scanner(System.in);
        String reset = "\u001B[0m";
        String cyan = "\u001B[36m";
        String yellow = "\u001B[33m";
        String green = "\u001B[32m";
        System.out.println("Escolha uma opção:");
        System.out.println(yellow + "1" + reset + " - " + green + "Comprar algo!" + reset);
        System.out.println(yellow + "2" + reset + " - " + green + "Apenas dar uma olhadinha" + reset);
        System.out.println(yellow + "3" + reset + " - " + green + "Fazer uma reclamação!" + reset);

        boolean condicao = true;
        while (condicao) {
            DigiteRespostaInt();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Ok, volte sempre!");
                    condicao = false;
                    break;

                case 1:
                    boolean condicao2 = true;
                    while (condicao2) {
                        System.out.println("Ótimo! você aceita realizar um questionátio para te recomendarmos algo? (s/n)");
                        String opcao2 = scanner.next();
                        if (opcao2.equalsIgnoreCase("s")) {
                            System.out.println("em construção...");
                            condicao2 = false;
                            condicao = false;
                        } else if (opcao2.equalsIgnoreCase("n")) {
                            condicao2 = false;
                            condicao = false;
                            System.out.println("Ok, aqui está o nosso cardápio completo:");
                            VisualizarCardapio();

                        } else {
                            System.out.println("Não entendi, digite 'S' ou 'N'");
                        }
                    }
                    break;

                case 2:
                    System.out.println("a");
                    break;
                case 3:
                    System.out.println("b");
                    break;
                default:
                    System.out.println("Número inválido");
                    break;

            }
        }

    }

    void VisualizarCardapio() {

        String reset = "\u001B[0m";
        String cyan = "\u001B[36m";
        String yellow = "\u001B[33m";
        String green = "\u001B[32m";

        System.out.println(cyan + "        Bem-vindo à " + yellow + "Padaria Exemplo" + reset);
        System.out.println("---------------------------------------------");
        System.out.println("                   " + cyan + "Cardápio" + reset);
        System.out.println("---------------------------------------------");
        System.out.println("  Código |            Item             | Preço (R$)");
        System.out.println("---------------------------------------------");
        System.out.println("    1    |  " + yellow + "Pão Francês" + reset + "                |   " + green + "1.50" + reset);
        System.out.println("    2    |  " + yellow + "Pão de Forma" + reset + "               |   " + green + "3.00" + reset);
        System.out.println("    3    |  " + yellow + "Pão de Milho" + reset + "               |   " + green + "2.00" + reset);
        System.out.println("    4    |  " + yellow + "Pão de Queijo (unidade)" + reset + "    |   " + green + "1.00" + reset);
        System.out.println("    5    |  " + yellow + "Croissant" + reset + "                  |   " + green + "2.50" + reset);
        System.out.println("    6    |  " + yellow + "Bolo de Chocolate" + reset + "          |   " + green + "15.00" + reset);
        System.out.println("    7    |  " + yellow + "Bolo de Morango" + reset + "            |   " + green + "14.00" + reset);
        System.out.println("    8    |  " + yellow + "Café (xícara)" + reset + "              |   " + green + "2.00" + reset);
        System.out.println("    9    |  " + yellow + "Suco de Laranja (copo)" + reset + "     |   " + green + "4.00" + reset);
        System.out.println("    10   |  " + yellow + "Sanduíche de Presunto" + reset + "      |   " + green + "6.50" + reset);
        System.out.println("    11   |  " + yellow + "Sanduíche de Queijo" + reset + "        |   " + green + "5.50" + reset);
        System.out.println("    12   |  " + yellow + "Salgado (unidade)" + reset + "          |   " + green + "2.00" + reset);
        System.out.println("---------------------------------------------");
        System.out.println("    0    |  " + yellow + "Sair do Menu" + reset);
        System.out.println("---------------------------------------------");
    }
}






