package World;
import java.util.Scanner;

// Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido, considerando que o funcionário recebe 5% de comissão sobre o salário base.
public class Ex007 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu salário: R$");
        double preco = leia.nextDouble();

        leia.close();

        System.out.println("Seu salário é: "+(preco+(5/preco*100)));
    }

}
