package Javinha.Poo.Classes.DeverQuatro;

public class Farmacia {
    private String remedio;
    private String shampoo;
    private String condicionador;
    private String atendente;
    private double valorDaCompra;

    public Farmacia(String remedio, String shampoo, String condicionador, String atendente, double valorDaCompra) {
        this.remedio = remedio;
        this.shampoo = shampoo;
        this.condicionador = condicionador;
        this.atendente = atendente;
        this.valorDaCompra = valorDaCompra;
    }

    public void visualizar() {
        System.out.println("Remédio = " + remedio);
        System.out.println("shampoo = " + shampoo);
        System.out.println("condicionador = " + condicionador);
        System.out.println("valor da compra = " + valorDaCompra + " reais");
        System.out.println("Atendente = " + atendente);
    }

    public String getRemedio() {
        return remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public String getShampoo() {
        return shampoo;
    }

    public void setShampoo(String shampoo) {
        this.shampoo = shampoo;
    }

    public String getCondicionador() {
        return condicionador;
    }

    public void setCondicionador(String condicionador) {
        this.condicionador = condicionador;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }
}



