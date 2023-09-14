
package Javinha.Poo.HerancaPolimorfismo.DeverUm;

import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente("Kauê Murilo Silva", "65997171520", "brasileiro", "Rua Vereador Luizinho Pedro de Lima", "21/09/2002");
        Cliente cliente2 = new Cliente("João da Silva", "6546171520", "brasileiro", "Rua Vereador Bom Sucesso", "15/03/1995");
        PessoaFisica pessoaFisica1 = new PessoaFisica("Maria Santos", "7558469312", "brasileira", "Rua Marechal Deodoro", "10/05/1980", 1.65, "123.456.789-01", "9876543");
        PessoaFisica pessoaFisica2 = new PessoaFisica("Pedro Almeida", "9876543210", "brasileiro", "Rua Paulo Cezar", "03/12/1992", 1.78, "987.654.321-09", "7654321");
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa ABC Ltda.", "1122334455", "brasileira", "Rua Gonçalo", "05/06/2000", "12.345.678/0001-01", 21, "médio");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Empresa XYZ S.A.", "9988776655", "brasileira", "Rua Moisés", "12/07/1998", "99.888.777/0001-02", 23, "grande");


        System.out.println("Escolha uma opção:");
        System.out.println("1 - Visualizar Cliente 1");
        System.out.println("2 - Visualizar Cliente 2");
        System.out.println("3 - Visualizar Pessoa Física 1");
        System.out.println("4 - Visualizar Pessoa Física 2");
        System.out.println("5 - Visualizar Pessoa Jurídica 1");
        System.out.println("6 - Visualizar Pessoa Jurídica 2");
        System.out.println("0 - Sair");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 0 -> {
            } // Encerra o programa
            case 1 -> cliente.visualizar();
            case 2 -> cliente2.visualizar();
            case 3 -> pessoaFisica1.visualizar();
            case 4 -> pessoaFisica2.visualizar();
            case 5 -> pessoaJuridica1.visualizar();
            case 6 -> pessoaJuridica2.visualizar();
            default -> System.out.println("Opção inválida.");
        }
    }
}

