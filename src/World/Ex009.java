package World;
import java.util.Scanner;

//// Crie um programa que leia o valor do depósito mensal em uma poupança e a taxa de juros mensal, e calcule o montante após 12 meses.
public class Ex009 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do deposito: ");
        double deposito = leia.nextDouble();

        System.out.println("A taxa de juros mensal: R$");
        double taxaJuros = leia.nextDouble();

        leia.close();

        System.out.println("O valor total é"+(deposito+(taxaJuros*12)));
    }
}
