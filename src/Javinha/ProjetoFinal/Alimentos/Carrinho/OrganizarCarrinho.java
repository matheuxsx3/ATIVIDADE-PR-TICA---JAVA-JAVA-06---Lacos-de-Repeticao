package Javinha.ProjetoFinal.Alimentos.Carrinho;

public interface OrganizarCarrinho {

    void encontrarProdutoAdicionado(int id, int quantidade);

    void removerProduto(int id);

    public void exibirCarrinho();
    public void comprarItens();
}
