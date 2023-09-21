package Javinha.Poo.DeverUm;



class PessoaJuridica extends Cliente implements Visualizavel {

    private String cnpj;
    private int idadeDaEmpresa;
    private String porte;


    public PessoaJuridica(String nome, String numeroTelefone, String nacionalidade, String endereco, String dataInicioParceria, String cnpj, int idadeDaEmpresa, String porte) {
        super(nome, numeroTelefone, nacionalidade, endereco, dataInicioParceria);
        this.cnpj = cnpj;
        this.idadeDaEmpresa = idadeDaEmpresa;
        this.porte = porte;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("cnpj = "+cnpj);
        System.out.println("porte = "+porte+ " porte");
        System.out.println("idade da empresa = "+idadeDaEmpresa + " anos");
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getIdadeDaEmpresa() {
        return idadeDaEmpresa;
    }

    public void setIdadeDaEmpresa(int idadeDaEmpresa) {
        this.idadeDaEmpresa = idadeDaEmpresa;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}

