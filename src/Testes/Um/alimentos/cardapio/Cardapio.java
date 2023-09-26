package Testes.Um.alimentos.cardapio;

import Testes.Um.alimentos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    List<Produto> produtos = new ArrayList<>();

    void criaCardapio(){
    produtos.add(new Produto(1,"Carne", 1));
    }
}
