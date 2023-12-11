package World;
import java.util.Scanner;

// Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.
public class Ex010 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        leia.close();

        for(int i=1; i<=10; i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
    }
}
