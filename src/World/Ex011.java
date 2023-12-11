package World;
import java.util.Scanner;

//Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário
public class Ex011 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        double n1 = leia.nextDouble();

        System.out.println("Digite nota 2: ");
        double n2 = leia.nextDouble();

        System.out.println("Digite nota 3: ");
        double n3 = leia.nextDouble();

        leia.close();

        double mediaAritmetica = (n1 + n2 +n3)/3;

        System.out.println(mediaAritmetica);
    }
}
