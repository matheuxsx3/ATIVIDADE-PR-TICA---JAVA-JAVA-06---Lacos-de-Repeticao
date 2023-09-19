package Javinha.ProjetoFinal.Humanos;

public class Cliente extends Pessoa {
    private String numeroContato;
    private String endereco;
    @Override
    void visualizar() {
        super.visualizar();
        System.out.println("numero para contato :" + numeroContato);
        System.out.println("endereço :" + endereco);

    }
    public Cliente(String nome, String numeroContato, String endereco) {
        super(nome);
        this.numeroContato = numeroContato;
        this.endereco = endereco;
    }
    public Cliente(){
    }
    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
