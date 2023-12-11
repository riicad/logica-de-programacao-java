package World;
import java.util.Scanner;

//ça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a média ponderada considerando pesos 2, 3 e 5 para as notas, respectivamente.
public class Ex004 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite nota 1 de (0 a 10): ");
        double n1 = leia.nextDouble();

        System.out.println("Digite nota 2(0 a 10): ");
        double n2 = leia.nextDouble();

        System.out.println("Digite nota 3(0 a 10): ");
        double n3 = leia.nextDouble();

        leia.close();

        double media = (n1*2 + n2*3 + n3*5)/3;

        System.out.println("A sua média é: "+media);
    }
}
