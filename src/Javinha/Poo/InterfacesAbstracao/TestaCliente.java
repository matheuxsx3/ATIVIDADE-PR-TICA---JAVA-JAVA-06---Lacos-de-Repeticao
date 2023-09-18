package Javinha.Poo.InterfacesAbstracao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class TestaCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Object> objetos = new ArrayList<>();
        objetos.add(new Cliente("Kauê Murilo Silva", "65997171520", "brasileiro", "Rua Vereador Luizinho Pedro de Lima", "21/09/2002"));
        objetos.add(new Cliente("João da Silva", "6546171520", "brasileiro", "Rua Vereador Bom Sucesso", "15/03/1995"));
        objetos.add(new PessoaFisica("Maria Santos", "7558469312", "brasileira", "Rua Marechal Deodoro", "10/05/1980", 1.65, "123.456.789-01", "9876543"));
        objetos.add(new PessoaFisica("Pedro Almeida", "9876543210", "brasileiro", "Rua Paulo Cezar", "03/12/1992", 1.78, "987.654.321-09", "7654321"));
        objetos.add(new PessoaJuridica("Empresa ABC Ltda.", "1122334455", "brasileira", "Rua Gonçalo", "05/06/2000", "12.345.678/0001-01", 21, "médio"));
        objetos.add(new PessoaJuridica("Empresa XYZ S.A.", "9988776655", "brasileira", "Rua Moisés", "12/07/1998", "99.888.777/0001-02", 23, "grande"));
        objetos.add(new Patrocinadores("Kauê Murilo Silva", "65997171520", "brasileiro", "Rua Vereador Luizinho Pedro de Lima"));
        objetos.add(new Patrocinadores("Kauê Murilo Silva", "65997171520", "brasileiro", "Rua Vereador Luizinho Pedro de Lima"));

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
                            visualizarObjeto(objetos.get(0));
                            break;
                        case 2:
                            visualizarObjeto(objetos.get(1));
                            break;
                        case 3:
                            visualizarObjeto(objetos.get(2));
                            break;
                        case 4:
                            visualizarObjeto(objetos.get(3));
                            break;
                        case 5:
                            visualizarObjeto(objetos.get(4));
                            break;
                        case 6:
                            visualizarObjeto(objetos.get(5));
                            break;
                        case 7:
                            visualizarObjeto(objetos.get(6));
                            break;
                        case 8:
                            visualizarObjeto(objetos.get(7));
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

    private static void visualizarObjeto(Object objeto) {
        if (objeto instanceof Visualizavel) {
            ((Visualizavel) objeto).visualizar();
        } else {
            System.out.println("Este objeto não pode ser visualizado.");
        }
    }
}
