package Javinha.ProjetoFinal.Humanos;

import java.util.Scanner;

public class IsCliente extends Cliente {

    public IsCliente(String nome, String numeroContato, String endereco) {
        super(nome, numeroContato, endereco);
    }

    public static Cliente verificarSeCliente(boolean parametro) {
        Scanner scanner = new Scanner(System.in);


        Cliente cliente = null;
        if (!parametro) {

            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();
            System.out.println("Digite seu numero de telefone:");
            String numeroTelefone = scanner.nextLine();
            System.out.println("Digite seu endereço:");
            String endereco = scanner.nextLine();
            cliente = new Cliente(nome, numeroTelefone, endereco);
        } else {
            System.out.println("Você já está cadastrado!");
        }
        return cliente;
    }
}

