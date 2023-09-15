
package Javinha.Poo.InterfacesAbstracao;


import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class TestaCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente("Kauê Murilo Silva", "65997171520", "brasileiro", "Rua Vereador Luizinho Pedro de Lima", "21/09/2002");
        Cliente cliente2 = new Cliente("João da Silva", "6546171520", "brasileiro", "Rua Vereador Bom Sucesso", "15/03/1995");
        PessoaFisica pessoaFisica1 = new PessoaFisica("Maria Santos", "7558469312", "brasileira", "Rua Marechal Deodoro", "10/05/1980", 1.65, "123.456.789-01", "9876543");
        PessoaFisica pessoaFisica2 = new PessoaFisica("Pedro Almeida", "9876543210", "brasileiro", "Rua Paulo Cezar", "03/12/1992", 1.78, "987.654.321-09", "7654321");
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa ABC Ltda.", "1122334455", "brasileira", "Rua Gonçalo", "05/06/2000", "12.345.678/0001-01", 21, "médio");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Empresa XYZ S.A.", "9988776655", "brasileira", "Rua Moisés", "12/07/1998", "99.888.777/0001-02", 23, "grande");
        Patrocinadores patrocinador1 = new Patrocinadores("Kauê Murilo Silva", "65997171520", "brasileiro", "Rua Vereador Luizinho Pedro de Lima");
        Patrocinadores patrocinador2 = new Patrocinadores("Kauê Murilo Silva", "65997171520", "brasileiro", "Rua Vereador Luizinho Pedro de Lima");

        System.out.println("*******************************************************************************");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Visualizar Cliente 1");
        System.out.println("2 - Visualizar Cliente 2");
        System.out.println("3 - Visualizar Pessoa Física 1");
        System.out.println("4 - Visualizar Pessoa Física 2");
        System.out.println("5 - Visualizar Pessoa Jurídica 1");
        System.out.println("6 - Visualizar Pessoa Jurídica 2");
        System.out.println("7 - Visualizar Patrocinador 1");
        System.out.println("8 - Visualizar Patrocinador 2");
        System.out.println("0 - Sair");
        System.out.println("*******************************************************************************");

        AtomicBoolean sair = new AtomicBoolean(true);
        while (sair.get()) {
            System.out.println("\n////////Digite um número:////////");

            try {
                Optional<Integer> opcaoOptional = Optional.of(scanner.nextInt());
                opcaoOptional.ifPresent(opcao -> {
                    switch (opcao) {
                        case 0:
                            sair.set(false);
                            break;
                        case 1:
                            cliente.visualizar();
                            break;
                        case 2:
                            cliente2.visualizar();
                            break;
                        case 3:
                            pessoaFisica1.visualizar();
                            break;
                        case 4:
                            pessoaFisica2.visualizar();
                            break;
                        case 5:
                            pessoaJuridica1.visualizar();
                            break;
                        case 6:
                            pessoaJuridica2.visualizar();
                            break;
                        case 7:
                            patrocinador1.visualizar();
                            patrocinador1.produtoContribuido();
                            break;
                        case 8:
                            patrocinador2.visualizar();
                            patrocinador2.produtoContribuido();
                            break;
                        default:
                            System.out.println("Opção inválida: " + opcao);
                    }
                });
            } catch (Exception e) {
                System.err.println("Erro: Entrada inválida.");
                scanner.nextLine();
            }
        }
    }
}

