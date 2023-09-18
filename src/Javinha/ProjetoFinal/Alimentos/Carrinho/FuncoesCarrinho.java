package Javinha.ProjetoFinal.Alimentos.Carrinho;

import Javinha.ProjetoFinal.Alimentos.Cardapios.Cardapio;
import Javinha.ProjetoFinal.Alimentos.Produto;

import java.util.List;

public class FuncoesCarrinho {
    Carrinho carrinho = new Carrinho();
    Produto[] cardapio = Cardapio.getCardapio();
    int quantidadeCarrinho;

    public void encontrarProdutoAdicionado(int id, int quantidade) {
        Produto produtoSelecionado = null;
        for (
                Produto produto : cardapio) {
            if (produto.getCodigo() == id) {
                produtoSelecionado = produto;
            }
        }
        if (produtoSelecionado != null) {
            if ((produtoSelecionado.getQuantidade() - quantidade) < 0) {
                System.err.println("A quantidade informada não está disponivel!");
                System.err.println("O produto não foi adicionado ao carrinho.");

            } else {
                carrinho.itens.add(produtoSelecionado);
                System.out.println("Produto adicionado ao carrinho: " + produtoSelecionado.getNome());
                int subtrairQuantidade = produtoSelecionado.getQuantidade() - quantidade;
                produtoSelecionado.setQuantidade(subtrairQuantidade);
                quantidadeCarrinho = quantidade;
                System.out.println("A quantidade de " + produtoSelecionado.getNome().strip() + " agora é: " + produtoSelecionado.getQuantidade());

            }
        } else {
            System.err.println("O código informado não corresponde a nenhum produto!");
        }
    }

    public void removerProduto(int id) {
        List<Produto> itensNoCarrinho = carrinho.getItens();
        Produto variavel = null;
        for (
                Produto produto : itensNoCarrinho) {
            if (produto.getCodigo() == id) {
                variavel = produto;
            }
        }
        if (variavel != null) {
            itensNoCarrinho.remove(variavel);
            System.out.println(variavel.getNome().strip() + " foi REMOVIDO do carrinho.");
            int adicionarQuantidade = variavel.getQuantidade()+quantidadeCarrinho;
            variavel.setQuantidade(adicionarQuantidade);
        }else {
            System.out.println("Não foi possível encontrar o produto no carrinho");
        }
    }

    public void exibirCarrinho() {
        List<Produto> itensNoCarrinho = carrinho.getItens();

        if (itensNoCarrinho.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Produto item : itensNoCarrinho) {
                System.out.println(" Nome: " + item.getNome().strip() + ", Preço: " + item.getPreco() + ", Quantidade: " + quantidadeCarrinho);
            }
        }
    }
}
