package FACCAT;
import java.util.Scanner;
//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês
        //mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
        //efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
        //vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
        //vendedor
public class Ex011 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Salario fixo: R$");
        double salario = leia.nextDouble();

        System.out.println("Qual valor da sua comissão R$");
        double comissao = leia.nextDouble();

        System.out.println("Digite o número de carros vendidos: ");
        int carrosVendidos = leia.nextInt();

        leia.close();

        double salarioTotal = salario+(comissao*carrosVendidos)+(5/(comissao*carrosVendidos))*100;

        System.out.println("O total salario do funcionario é: "+salarioTotal);
    }
}
