//Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String),
// o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float).
// A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.

 package Javinha.LacosDecisao.SwichCase;
import java.util.Scanner;

public class DeverDois {
    public static void main(String[] args) {


        System.out.println("########REAJUSTE SALARIAL########\n1 = Gerente= +10%\n2 - Vendedor= +7%\n3 = Supervisor= +9%\n4 = Motorista= +6%\n5 = Estoquista= +5%\n6 = Técnico de TI= +8%\n########################");
        Scanner leia = new Scanner(System.in);

        System.out.println("Nome do colaborador:");
        String colaborador = leia.next();

        System.out.println("Digite o código do cargo:");
        int opcao = leia.nextInt();

        System.out.println("Digite o salário:");
        int salario = leia.nextInt();

        double novoSalario;
        String cargo;
        switch (opcao) {
            case 1:
                cargo = "gerente";
                novoSalario = salario + ((double) 10 / 100) * salario;
                System.out.println("Nome do colaborador=" + colaborador + "\nCargo=" + cargo + "\nSalário=" + novoSalario);

                break;
            case 2:
                cargo = "Vendedor";
                novoSalario = salario + ((double) 7 / 100) * salario;
                System.out.println("Nome do colaborador=" + colaborador + "\nCargo=" + cargo + "\nSalário=" + novoSalario);
                break;

            case 3:
                cargo = "Supervisor";
                novoSalario = salario + ((double) 9 / 100) * salario;
                System.out.println("Nome do colaborador=" + colaborador + "\nCargo=" + cargo + "\nSalário=" + novoSalario);
                break;
            case 4:
                cargo = "Motorista";
                novoSalario = salario + ((double) 6 / 100) * salario;
                System.out.println("Nome do colaborador=" + colaborador + "\nCargo=" + cargo + "\nSalário=" + novoSalario);
                break;
            case 5:
                cargo = "Estoquista";
                novoSalario = salario + ((double) 5 / 100) * salario;
                System.out.println("Nome do colaborador=" + colaborador + "\nCargo=" + cargo + "\nSalário=" + novoSalario);
                break;
            case 6:
                cargo = "gerente";
                novoSalario = salario + ((double) 8 / 100) * salario;
                System.out.println("Nome do colaborador=" + colaborador + "\nCargo=" + cargo + "\nSalário=" + novoSalario);
                break;
        }


    }

}

