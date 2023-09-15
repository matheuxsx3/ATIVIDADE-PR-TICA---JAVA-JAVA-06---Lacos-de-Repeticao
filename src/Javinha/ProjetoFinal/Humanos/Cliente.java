package Javinha.ProjetoFinal.Humanos;

public class Cliente extends Pessoa {
    private String numeroContato;
    private String endereco;

    public Cliente(String nome, String numeroContato, String endereco, String numeroContato1, String endereco1) {
        super(nome, numeroContato, endereco);
        this.numeroContato = numeroContato1;
        this.endereco = endereco1;
    }

    @Override
    void visualizar() {
        super.visualizar();
        System.out.println("numero para contato :" + numeroContato);
        System.out.println("endereço :" + endereco);

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
