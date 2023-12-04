package FACCAT;
import java.util.Scanner;

//Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
//ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
//ultrapassar este valor, calcular e escrever o seu salário total
public class Ex024 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Salario Fixo: ");
        double salarioFixo = leia.nextDouble();

        System.out.println("Valor das vendas evetuadas: ");
        double valorVendas = leia.nextDouble();

        leia.close();
        double salarioTotal;

        if(valorVendas>1500){
            salarioTotal = salarioFixo+(5/valorVendas)*100;
        }else{
            salarioTotal= salarioFixo+(3/valorVendas)*100;
        }

        System.out.println("Salário Total: R$"+salarioTotal);
    }
}
