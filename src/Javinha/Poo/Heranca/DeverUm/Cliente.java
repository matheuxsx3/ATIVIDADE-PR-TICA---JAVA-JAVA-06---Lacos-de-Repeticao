package Javinha.Poo.Heranca.DeverUm;

import java.sql.Struct;

class Cliente {
    private String nome;
    private String numeroTelefone;
    private String nacionalidade;
    private String endereco;
    private String dataInicioParceria;

    public Cliente(String nome, String numeroTelefone, String nacionalidade, String endereco, String dataInicioParceria) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.nacionalidade = nacionalidade;
        this.endereco = endereco;
        this.dataInicioParceria = dataInicioParceria;
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Número de Telefone: " + numeroTelefone);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data de Início da Parceria: " + dataInicioParceria);
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

    public String getDataInicioParceria() {
        return dataInicioParceria;
    }

    public void setDataInicioParceria(String dataInicioParceria) {
        this.dataInicioParceria = dataInicioParceria;
    }
}
