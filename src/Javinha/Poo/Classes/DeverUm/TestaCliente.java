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

public class TestaCliente {
    public static void main(String[] args) {
        Cliente clienteUm = new Cliente("Matheus", 123456789, 123456789, 19, true);
        Cliente clienteDois = new Cliente("Monique", 123456777, 123456999, 30, false);

        System.out.println("cliente 1:");
        clienteUm.visualizar();

        System.out.println("\ncliente 2:");
        clienteDois.visualizar();
    }
}
