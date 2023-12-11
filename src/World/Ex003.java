package World;
import java.util.Scanner;

// Crie um programa que leia a base e a altura de um triângulo e calcule sua área.
public class Ex003 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a altura do triangulo: ");
        double altura = leia.nextDouble();

        System.out.println("Digite a base do triangulo: ");
        double base = leia.nextDouble();

        leia.close();

        System.out.println("A area do triângulo é: "+(base*altura));


    }
}
