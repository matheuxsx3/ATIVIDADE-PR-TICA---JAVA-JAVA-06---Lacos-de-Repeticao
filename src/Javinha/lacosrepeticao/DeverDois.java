//questão 3
// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
// via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade
// seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo
package Javinha.lacosrepeticao;
import java.util.Scanner;
public class DeverDois {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int menores21 = 0, maiores50 = 0, idade;
        boolean condicao = true;

        while (condicao) {
            System.out.println("Digite uma idade:");
            idade = leia.nextInt();
            if (idade < 21 && idade > 0) {
                menores21++;


            } else if (idade > 50) {
                maiores50++;
            } else if (idade < 0) {
                condicao = false;
            }
        }
        System.out.println("Total de pessoas menores de 21 anos:\n" + menores21 + "\nTotal de pessoas maiores de 50 anos:\n" + maiores50);
    }
}
