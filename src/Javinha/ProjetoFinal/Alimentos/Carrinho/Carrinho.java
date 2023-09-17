package Javinha.ProjetoFinal.Alimentos.Carrinho;
import Javinha.ProjetoFinal.Alimentos.Produto;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    ArrayList<Produto> itens = new ArrayList<>();

    public void adicionarProdutoAoCarrinho(Produto produto) {
        itens.add(produto);
    }

    public List<Produto> getItens() {
        return itens;
    }
}




