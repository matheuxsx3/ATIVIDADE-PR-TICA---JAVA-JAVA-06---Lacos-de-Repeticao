/*Atividade 01

        Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Cliente com os seus respectivos Métodos e Atributos. Na sequência, crie uma Classe chamada TestaCliente, instancie dois objetos da Classe Cliente e apresente as informações destes 2 Objetos no console.

        Boas práticas:

        Crie a Classe Cliente e defina pelo menos 5 Atributos relevantes ao Objeto Cliente, a sua escolha;
        Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Cliente;
        Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Cliente nos argumentos do Método;
        Crie os Métodos Get e Set para todos os Atributos da Classe Cliente;
        Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Cliente;
        Crie a Classe TestaCliente no mesmo pacote da Classe Cliente, contendo o Método main() e instancie 2 Objetos da Classe Cliente;
        Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.
*/

package Javinha.Poo.Classes.DeverUm;

class Cliente {
    private String nome;
    private int rg;
    private int cpf;
    private int idade;
    private boolean sexo;

    public Cliente(String nome, int rg, int cpf, int idade, boolean sexo) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void visualizar() {
        System.out.println("nome = " + nome);
        System.out.println("Rg = " + rg);
        System.out.println("Cpf = " + cpf);
        System.out.println("idade = " + idade);
        if (sexo) {
            System.out.println("sexo = masculino");
        } else {
            System.out.println("sexo = feminino");
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }


}
