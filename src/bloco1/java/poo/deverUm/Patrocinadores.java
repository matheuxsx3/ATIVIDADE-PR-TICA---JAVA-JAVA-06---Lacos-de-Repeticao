package bloco1.java.poo.deverUm;

public class Patrocinadores extends Pessoa implements Contrato,Visualizavel {

    @Override
    public void produtoContribuido() {
        System.out.println("Produto contribuído : carne");
    }

    public Patrocinadores(String nome, String numeroTelefone, String nacionalidade, String endereco) {
        super(nome, numeroTelefone, nacionalidade, endereco);
    }

    public Patrocinadores() {
    }
}