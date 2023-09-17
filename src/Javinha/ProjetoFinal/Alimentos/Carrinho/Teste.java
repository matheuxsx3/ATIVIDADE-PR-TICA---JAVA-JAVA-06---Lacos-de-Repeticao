package Javinha.ProjetoFinal.Alimentos.Carrinho;

import Javinha.ProjetoFinal.Alimentos.Cardapios.Cardapio;
import Javinha.ProjetoFinal.Alimentos.Produto;

import java.util.List;

public class Teste {
    Carrinho carrinho = new Carrinho();
    Produto[] cardapio = Cardapio.inicializarCardapio();
    List<Produto> itensNoCarrinho = carrinho.getItens();

    public void encontrarProdutoAdicionado(int id, int quantidade) {
        Produto produtoSelecionado = null;
        for (
                Produto produto : cardapio) {
            if (produto.getCodigo() == id) {
                produtoSelecionado = produto;
            }
        }
        if (produtoSelecionado != null) {
            produtoSelecionado.setQuantidade(quantidade);
            itensNoCarrinho.add(produtoSelecionado);
            System.out.println("Produto adicionado ao carrinho: " + produtoSelecionado.getNome());
        } else {
            System.out.println("O produto não foi adicionado ao carrinho!");
        }
    }

    public void exibirCarrinho() {

        if (itensNoCarrinho.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Produto item : itensNoCarrinho) { // Usando itensNoCarrinho em vez de carrinho.itens
                System.out.println("Código: " + item.getCodigo() + ", Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
            }
        }
    }


}
