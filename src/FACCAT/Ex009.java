package FACCAT;
import java.util.Scanner;

//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário.
public class Ex009 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: R$");
        double salario = leia.nextDouble();

        System.out.println("Digite o valor do seu reajuste (%): ");
        int reajuste = leia.nextInt();

        leia.close();

        double novoSalario = salario + (reajuste/salario)*100;
        System.out.printf("O salário com reajuste é: %.2f", novoSalario);
    }
}
