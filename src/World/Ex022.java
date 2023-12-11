package World;
import java.util.Scanner;

//Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus. Se o salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.
public class Ex022 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do salario: ");
        double salario = leia.nextDouble();

        leia.close();

        System.out.println("O salário novo dele será de: "+(salario+((salario>2000 ? 10 : 5)/salario)*100));
    }
}
