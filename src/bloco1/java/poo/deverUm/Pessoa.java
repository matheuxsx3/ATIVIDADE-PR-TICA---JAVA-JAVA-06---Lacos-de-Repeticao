package bloco1.java.poo.deverUm;

public abstract class Pessoa {
    private String nome;
    private String numeroTelefone;
    private String nacionalidade;
    private String endereco;

    public Pessoa(String nome, String numeroTelefone, String nacionalidade, String endereco) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.nacionalidade = nacionalidade;
        this.endereco = endereco;
    }

    public Pessoa() {
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Número de Telefone: " + numeroTelefone);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Endereço: " + endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
