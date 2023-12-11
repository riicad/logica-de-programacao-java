package World;
import java.util.Scanner;

// Crie um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC).
public class Ex012 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = leia.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = leia.nextDouble();

        leia.close();

        double IMC = peso/(altura*altura);

        System.out.println("Seu IMC é: "+IMC);
    }
}
