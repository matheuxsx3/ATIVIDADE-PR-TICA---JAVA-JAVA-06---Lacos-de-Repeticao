package Javinha.ProjetoFinal.Humanos;

public class Funcionario extends Pessoa {
    private int numeroDeIdentificacao;
    private String cargo;
    private double salario;

    public Funcionario(String nome, int numeroDeIdentificacao, String cargo, double salario) {
        super(nome);
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getNumeroDeIdentificacao() {
        return numeroDeIdentificacao;
    }

    public void setNumeroDeIdentificacao(int numeroDeIdentificacao) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
