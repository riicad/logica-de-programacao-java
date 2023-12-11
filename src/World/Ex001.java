package World;
import java.util.Scanner;

// Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.
public class Ex001 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num = leia.nextInt();

        System.out.println("Segundo número: ");
        int num2 = leia.nextInt();

        leia.close();

        System.out.println("A soma deles é: "+(num+num2));
        System.out.println("A subtração deles é: "+(num-num2));
        System.out.println("A divisão deles é: "+(num/num2));
        System.out.println("A multiplicação deles é: "+(num*num2));

    }
}