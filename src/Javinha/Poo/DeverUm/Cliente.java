package Javinha.Poo.DeverUm;

class Cliente extends Pessoa implements Visualizavel {
    private String dataInicioParceria;

    public Cliente(String nome, String numeroTelefone, String nacionalidade, String endereco, String dataInicioParceria) {
        super(nome, numeroTelefone, nacionalidade, endereco);
        this.dataInicioParceria = dataInicioParceria;
    }

    public Cliente(String dataInicioParceria) {
        this.dataInicioParceria = dataInicioParceria;
    }
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Data de Início da Parceria: " + dataInicioParceria);
    }

    public String getDataInicioParceria() {
        return dataInicioParceria;
    }

    public void setDataInicioParceria(String dataInicioParceria) {
        this.dataInicioParceria = dataInicioParceria;
    }
}
