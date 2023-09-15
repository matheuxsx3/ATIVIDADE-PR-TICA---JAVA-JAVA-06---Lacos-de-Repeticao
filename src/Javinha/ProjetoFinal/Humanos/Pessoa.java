package Javinha.ProjetoFinal.Humanos;

public abstract class Pessoa {
    private String nome;


    public Pessoa(String nome, String numeroContato, String endereco) {
        this.nome = nome;
    }

    void visualizar() {
        System.out.println("nome : " + nome);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
