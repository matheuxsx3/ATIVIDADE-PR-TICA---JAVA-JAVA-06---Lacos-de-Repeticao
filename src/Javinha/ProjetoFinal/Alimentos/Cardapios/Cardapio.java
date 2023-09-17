package Javinha.ProjetoFinal.Alimentos.Cardapios;
import Javinha.ProjetoFinal.Alimentos.Produto;
import Javinha.ProjetoFinal.Funcoes.MenuCardapio;

import java.util.Random;

public class Cardapio {
    public static Produto[] inicializarCardapio() {
        return new Produto[]{
                new Produto( 1," Pão Francês        ",1.00, getRandomQuantidade()),
                new Produto( 2, "Croissant          ",1.50, getRandomQuantidade()),
                new Produto( 3, "Bolo de Chocolate  ",3.75, getRandomQuantidade()),
                new Produto( 4, "Sanduíche de Frango", 5.25, getRandomQuantidade()),
                new Produto( 5, "Café Expresso      ", 2.00, getRandomQuantidade()),
                new Produto( 6, "Muffin de Blueberry", 2.25, getRandomQuantidade()),
                new Produto( 7, "Baguete            ", 2.50, getRandomQuantidade()),
                new Produto( 8, "Biscoito de Nutella", 5.00, getRandomQuantidade()),
                new Produto( 9, "Torta de Maçã      ", 4.00, getRandomQuantidade()),
                new Produto(10, "Chocolat Chaud     ", 3.50, getRandomQuantidade()),
                new Produto(11, "Pão Integral       ", 1.25, getRandomQuantidade()),
                new Produto(12, "Pão de Centeio     ", 1.50, getRandomQuantidade()),
                new Produto(13, "Queijo Gouda       ", 2.75, getRandomQuantidade()),
                new Produto(14, "Queijo Brie        ", 3.25, getRandomQuantidade()),
                new Produto(15, "Queijo Cheddar     ", 2.50, getRandomQuantidade()),
                new Produto(16, "Croissant recheado ", 1.75, getRandomQuantidade()),
                new Produto(17, "Donut de Morango   ", 1.95, getRandomQuantidade()),
                new Produto(18, "Bolo de Cenoura    ", 3.50, getRandomQuantidade()),
                new Produto(19, "Cappuccino         ", 3.00, getRandomQuantidade()),
                new Produto(20, "Suco de Laranja    ", 2.50, getRandomQuantidade()),
                new Produto(21, "Água Mineral       ", 1.00, getRandomQuantidade())
        };
    }

    public static void mostrarCardapio(Produto[] produtos) {
        System.out.println("│---------------------------------------------------------│");
        System.out.println("│                       Cardápio                          │");
        System.out.println("│-------------------------------------------------------  │");
        System.out.println("│  Código │       Item          │ Preço (R$) │ Quantidade │");
        System.out.println("│-------------------------------------------------------- │");

        for (Produto produto : produtos) {
            System.out.printf("    %2d  │  %-18s │ %9.2f  │ %d%n ",
                    produto.getCodigo(), produto.getNome(), produto.getPreco(), produto.getQuantidade());
        }

        System.out.println("│---------------------------------------------------------│");
        MenuCardapio menuCardapio = new MenuCardapio();
        menuCardapio.escolha();
    }
    static int getRandomQuantidade() {
        Random random = new Random();
        return random.nextInt(100);
    }
}

