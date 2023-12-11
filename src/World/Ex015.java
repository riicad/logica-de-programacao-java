package World;
import java.util.Scanner;

//15) Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.
public class Ex015 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = leia.nextDouble();

        leia.close();

        System.out.println("Seu novo salário é: "+(salario+(15/salario)*100));
    }
}
