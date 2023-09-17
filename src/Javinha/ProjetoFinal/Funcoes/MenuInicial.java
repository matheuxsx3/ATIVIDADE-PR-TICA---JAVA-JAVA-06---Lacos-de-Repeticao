package Javinha.ProjetoFinal.Funcoes;

import Javinha.ProjetoFinal.Alimentos.Produto;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import static Javinha.ProjetoFinal.Alimentos.Cardapios.Cardapio.inicializarCardapio;
import static Javinha.ProjetoFinal.Alimentos.Cardapios.Cardapio.mostrarCardapio;

public class MenuInicial {
    public void boasVindas() {
        System.out.println("*******************************************************************************");
        System.out.println("                      Bem vindo à padaria Pão Açucarado!                       ");
        System.out.println("*******************************************************************************");
        System.out.println("                                 ______    ");
        System.out.println("                                /      \\   ");
        System.out.println("                               /        \\  ");
        System.out.println("                              /          \\ ");
        System.out.println("                             /            \\ ");
        System.out.println("                            |    __  __    |");
        System.out.println("                            |   |  ||  |   |");
        System.out.println("                            |___|__||__|___|");
    }

    public void menuInicial() {
        System.out.println("===================================");
        System.out.println("           Menu de Ações           ");
        System.out.println("===================================");
        System.out.println("  1. Reservar uma mesa");
        System.out.println("  2. Ver o cardápio");
        System.out.println("  3. Fazer um pedido online");
        System.out.println("  4. Entrar em contato");
        System.out.println("  5. Avaliar o nosso serviço");
        System.out.println("  0. Sair");
        System.out.println("===================================");

        System.out.print("Escolha uma opção: ");
        Scanner scanner = new Scanner(System.in);
        Optional<Integer> optional = Optional.of(lerEscolha(scanner));
        optional.ifPresent(escolha -> {
            switch (escolha) {
                case 1:
                    System.out.println("\nVocê escolheu Reservar uma mesa.\n");

                    break;
                case 2:
                    System.out.println("\nVocê escolheu Ver o cardápio, aqui está:\n");
                    Produto[] produtos = inicializarCardapio();
                    mostrarCardapio(produtos);

                    break;
                case 3:
                    System.out.println("\nVocê escolheu Fazer um pedido.\n");

                    break;
                case 4:
                    System.out.println("\nVocê escolheu Entrar em contato.\n");

                    break;
                case 5:
                    System.out.println("\nVocê escolheu Avaliar o nosso serviço.\n");
                    break;
                case 0:
                    System.out.println("\nSaindo do menu. Até logo!\n");
                    break;
                default:
                    throw new UnsupportedOperationException("Escolha inválida!");
            }
        });
    }

    public static Integer lerEscolha(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Entrada inválida! Insira um número válido.");
        }
    }
}

