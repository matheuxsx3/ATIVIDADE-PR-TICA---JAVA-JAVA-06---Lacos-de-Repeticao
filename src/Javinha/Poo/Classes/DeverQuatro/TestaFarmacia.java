/*Atividade 04

        Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, crie a Classe Farmacia com os seus respectivos Métodos e Atributos, que descreva os produtos de uma Farmácia. Na sequência, crie uma Classe chamada TestaFarmacia, instancie dois objetos da Classe Farmacia e apresente as informações destes 2 Objetos no console.

        Boas práticas:

        Crie a Classe Farmacia e defina pelo menos 5 Atributos relevantes aos Produtos de uma Farmacia, a sua escolha;
        Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer produto da Farmácia;
        Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Farmacia nos argumentos do Método;
        Crie os Métodos Get e Set para todos os Atributos da Classe Farmacia;
        Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Farmacia;
        Crie a Classe TestaFarmacia no mesmo pacote da Classe Farmacia, contendo o Método main() e instancie 2 Objetos da Classe Farmacia;
        Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados.

        package Javinha.Poo.Classes.DeverDois;*/

package Javinha.Poo.Classes.DeverQuatro;
public class TestaFarmacia {
    public static void main(String[] args) {
    Farmacia farmacia1 = new Farmacia("Dipirona", "Clear men", "Above","Maxsuel", 100);
        System.out.println("\nFarmacia 1 = \n");
        farmacia1.visualizar();
        Farmacia farmacia2 = new Farmacia("Dorflex", "TRESemmé","SEDA","Enzo",300);
        System.out.println("\nFarmacia 2 = \n" );
        farmacia2.visualizar();
    }
}
