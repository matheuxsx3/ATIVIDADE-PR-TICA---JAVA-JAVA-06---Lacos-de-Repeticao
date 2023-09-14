package Javinha.Poo.HerancaPolimorfismo.DeverUm;

final class PessoaFisica extends Cliente {
    private double altura;
    private String cpf;
    private String rg;

    public PessoaFisica(String nome, String numeroTelefone, String nacionalidade, String endereco, String dataInicioParceria, double altura, String cpf, String rg) {
        super(nome, numeroTelefone, nacionalidade, endereco, dataInicioParceria);
        this.altura = altura;
        this.cpf = cpf;
        this.rg = rg;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("altura = "+ altura);
        System.out.println("cpf = "+ cpf);
        System.out.println("rg = "+ rg);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}

